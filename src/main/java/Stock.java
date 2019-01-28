/*
ebenezergraham created on 1/28/19
*/

import java.util.*;

public class Stock {
	
	static String line = "Vodafone,STOCK,10,50,0|Google,STOCK,15,50,0|Microsoft,BOND,15,100,0.05:Vodafone,STOCK,15,50,0|Google,STOCK,10,50,0|Microsoft,BOND,15,100,0.05";
	static final String BUY = "BUY";
	static final String SELL = "SELL";
	
	public static void main(String [] args){
	String [] categories = line.split(":");
	List<String> portfolioAssets = Arrays.asList(categories[0].split("\\|"));
	List<String> benchmarkAssets = Arrays.asList(categories[1].split("\\|"));
	Collections.sort(portfolioAssets);
	Collections.sort(benchmarkAssets);
		String [] portfolioAsset;
		String [] benchmarkAsset;
		List<String> output = new ArrayList<>();
		for(int index = 0; index<portfolioAssets.size();index++) {
			portfolioAsset = portfolioAssets.get(index).split(",");
			benchmarkAsset = benchmarkAssets.get(index).split(",");
			String action = evaluateAsset(portfolioAsset[0],Integer.parseInt(portfolioAsset[2]),Integer.parseInt(benchmarkAsset[2]));
			if(action != null) output.add(action);
		}
		
		output.forEach(value-> System.out.println(value));
	}
	
	public static String evaluateAsset(String assetName, int portfolioShare, int benchmarkShare){
		String transaction = null;
		if(benchmarkShare > portfolioShare){
			transaction = BUY+",";
			transaction += assetName+",";
			transaction += benchmarkShare - portfolioShare;
			
		}else if(benchmarkShare < portfolioShare){
			transaction = SELL+",";
			transaction += assetName+",";
			transaction+= portfolioShare - benchmarkShare;
		}
		return transaction;
	}
	
}

package me.ebenezergraham.tinycode.java;

import java.util.ArrayList;
import java.util.List;

public class WorstPerformingStock {
	
	List<Integer> list = new ArrayList<>();
	
	public WorstPerformingStock() {
	}
	
	public int worstPerformingStock(List<List<Integer>> prices) {
		// Id is assigned to 0 hence returns 0 If array is empty
		int id = 0;
		boolean firstRun = true;
		double worstStock = 0.0;
		for( List<Integer> stockTuple:prices){
			double opening = stockTuple.get(1);
			double closing = stockTuple.get(2);
			double result = (closing-opening)/opening;
			if(result<worstStock || firstRun){
				id = stockTuple.get(0);
				worstStock = result;
			}
			firstRun = false;
		}
		return id;
	}
}

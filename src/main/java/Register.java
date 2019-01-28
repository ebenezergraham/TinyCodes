/*
ebenezergraham created on 1/27/19
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Register {
	/* storing the contents of the register in a LinkedHashMap.
	* using LinkedHashMap to preserve the order in which objects are inserted*/
	static Map<Double,String> register =  new LinkedHashMap<>();
	
	public static void main(String[] args) {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		String line;
		//populating contents of the register.
		register.put(new Double(100.00),"ONE HUNDRED");
		register.put(new Double(50.00),"FIFTY");
		register.put(new Double(20.00),"TWENTY");
		register.put(new Double(10.00),"TEN");
		register.put(new Double(5.00),"FIVE");
		register.put(new Double(2.00),"TWO");
		register.put(new Double(1.00),"ONE");
		register.put(new Double(.50),"HALF DOLLAR");
		register.put(new Double(.25),"QUARTER");
		register.put(new Double(.10),"DIME");
		register.put(new Double(.05),"NICKEL");
		register.put(new Double(.01),"PENNY");
		
		try {
			while ((line = in.readLine()) != null) {
				
				String[] input = line.split(";");
				double purchasePrice = new Double(input[0]);
				double cashPrice = new Double(input[1]);
				
				if (cashPrice < purchasePrice) {
					System.out.println("ERROR");
				} else if (cashPrice == purchasePrice) {
					System.out.println("ZERO");
				} else {
					double change = cashPrice - purchasePrice;
					if (register.get(change) == null) {
						/* using a Tree set to store the response after calculation.
						* the tree set will keep the items sorted so we can just return it*/
						
						Set<String> response = valueBreakDown(change);
						String output = "";
						int counter = 0;
						for ( String entry : response){
							output +=	response.size() == counter +1 ? entry : entry + ",";
							counter++;
						}
						System.out.print(output);
					} else {
						System.out.print(register.get(change));
					}
					
				}
				
			}
		}catch (IOException e){
			System.out.println(e.toString());
		}
	}
	
	public static Set<String> valueBreakDown( Double change){
		Set<String> result = new TreeSet();
		for(Double denomination : register.keySet()){
			if(denomination > change) continue;
			while (change >= denomination && change != 0) {
				change = change - denomination;
				result.add(register.get(denomination));
			}
		}
		return result;
	}
}

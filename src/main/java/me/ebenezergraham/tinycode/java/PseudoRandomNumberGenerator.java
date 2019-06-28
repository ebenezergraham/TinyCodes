package me.ebenezergraham.tinycode.java;

import java.util.ArrayList;
import java.util.List;

public class PseudoRandomNumberGenerator {
	
	List<Integer> list = new ArrayList<>();
	
	public PseudoRandomNumberGenerator() {
	}
	
	/**
	 * @return generates a set of random numbers
	 * @author (Ebenezer Graham)
	 * @version (1.0)
	 */
	public List<Integer> generateRandomNumber(int numToGen, int seed) {
		int a = 12;
		int b = 5;
		int n = 100;
		
		while (numToGen != 0) {
			seed = (a * seed + b) % n;
			list.add(seed);
			numToGen--;
		}
		return list;
	}
}

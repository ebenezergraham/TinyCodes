package me.ebenezergraham.tinycode.java;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class WorstPerformingStockTest {
	
	@Test
	public void worstPerformingStock() {
		List<List<Integer>> prices  = new ArrayList<List<Integer>>();
		List<Integer> temp = new ArrayList<Integer>();
		
		temp.add(1200);
		temp.add(100);
		temp.add(105);
		
		prices.add(temp);
		List<Integer> tempa = new ArrayList<Integer>();
		
		tempa.add(1200);
		tempa.add(50);
		tempa.add(55);
		prices.add(tempa);
		WorstPerformingStock worstPerformingStock = new WorstPerformingStock();
		int res = worstPerformingStock.worstPerformingStock(prices);
		Assert.assertEquals(res,1200);
	}
}

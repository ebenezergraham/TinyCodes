package me.ebenezergraham.tinycode.java;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class LatestStudentTest {
	
	@Test
	public void latestStudent() {
		LatestStudent latestStudent = new LatestStudent();
		List<List<String>> prices  = new ArrayList<List<String>>();
		List<String> temp = new ArrayList<String>();
		
		temp.add("09-01");
		temp.add("Arlene");
		temp.add("540");
		temp.add("570");
		
		prices.add(temp);
		List<Integer> tempa = new ArrayList<Integer>();
		temp = new ArrayList<String>();
		temp.add("09-01");
		temp.add("Bobby");
		temp.add("540");
		temp.add("543");
		prices.add(temp);
		
		temp = new ArrayList<String>();
		temp.add("09-01");
		temp.add("Caroline");
		temp.add("540");
		temp.add("530");
		prices.add(temp);
		
		temp = new ArrayList<String>();
		temp.add("09-02");
		temp.add("Arlene");
		temp.add("540");
		temp.add("580");
		prices.add(temp);
		
		temp = new ArrayList<String>();
		temp.add("09-02");
		temp.add("Bobby");
		temp.add("540");
		temp.add("583");
		prices.add(temp);
		
		
		temp = new ArrayList<String>();
		temp.add("09-02");
		temp.add("Caroline");
		temp.add("540");
		temp.add("543");
		prices.add(temp);
		String expected = "Arlene";
		//Assert.assertEquals(expected,latestStudent.latestStudent(prices));
		System.out.println(latestStudent.latestStudent(prices));
	}
	
	
}

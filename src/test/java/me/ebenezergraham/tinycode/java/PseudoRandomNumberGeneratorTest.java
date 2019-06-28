package me.ebenezergraham.tinycode.java;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class PseudoRandomNumberGeneratorTest {
	
	@Test
	public void generateRandomNumber() {
		List<Integer> expected = new ArrayList<>();
		expected.add(9);
		expected.add(13);
		expected.add(61);
		expected.add(37);
		expected.add(49);
		
		PseudoRandomNumberGenerator pseudoRandomNumberGenerator = new PseudoRandomNumberGenerator();
		List actual = pseudoRandomNumberGenerator.generateRandomNumber(5,92);
		Assert.assertEquals(expected,actual);
	}
}

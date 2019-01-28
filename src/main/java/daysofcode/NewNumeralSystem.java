package daysofcode;

import java.util.ArrayList;
import java.util.List;

public class NewNumeralSystem {
	/**
	 * Your Informatics teacher at school likes coming up with new ways to help you understand the material.
	 * When you started studying numeral systems, he introduced his own numeral system, which he's convinced
	 * will help clarify things. His numeral system has base 26, and its digits are represented by English
	 * capital letters - A for 0, B for 1, and so on.
	 *
	 * The teacher assigned you the following numeral system exercise: given a one-digit number,
	 * you should find all unordered pairs of one-digit numbers whose values add up to the number.
	 * @param number
	 * @return
	 */
	
	String[] newNumeralSystem(char number) {
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int n = alphabet.indexOf(Character.toString(number));
		List<String> pairs = new ArrayList();
		for(int i = 0; i<(n/2)+1; i++){
			pairs.add(String.format("%s + %s",alphabet.charAt(i),alphabet.charAt(n-i)));
		}
		return pairs.toArray(new String[pairs.size()]);
	}
	
	// Example
	//newNumeralSystem('G'); // ["A + G", "B + F", "C + E", "D + D"]
}
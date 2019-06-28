package me.ebenezergraham.tinycode.java.daysofcode;

/*
ebenezergraham created on 1/28/19
*/

import java.util.ArrayList;
import java.util.List;

public class LongestSubstring {
	/*
	* Psuedocode
	* Take each char in the first string and compare with characters in the second string
	* Condition: if character exist check next char and find out if it exists in second string
	* Operation: store in a list of sub sequences
	* Condition: continue till it ends
	* Output: the longest string in the sub sequence
	* */
	
	public LongestSubstring() {
	}
	
	public String longestSubString(String s1 , String s2){
		String temp = "", longestSubsequence = null;
		int counter = 0;
		int lastIndex = 0;
		String c1 , c2 = "";
		for (int s1Index = counter; s1Index < s1.length(); s1Index++ ){
			c1 = String.valueOf(s1.charAt(s1Index));
			for(int s2Index = lastIndex ; s2Index < s2.length(); s2Index++ ){
				c2 = String.valueOf(s2.charAt(s2Index));
				if (c1.equalsIgnoreCase(c2)){
					temp+=c1;
					break;
				}
				lastIndex = s2Index;
			}
			
			if(lastIndex+1 ==c2.length()) {
				lastIndex = 0;
				if (temp.length() > longestSubsequence.length()) {
					longestSubsequence = temp;
					temp = "";
				}
			}
			s1Index = counter;
			System.out.format("%d - %d",s1Index,counter);
		}
		
		return longestSubsequence;
	}
}

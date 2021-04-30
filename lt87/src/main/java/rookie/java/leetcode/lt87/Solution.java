package rookie.java.leetcode.lt87;

import java.util.Arrays;

public class Solution {
	public boolean isScramble(String s1, String s2) {
		// pre-check
		if (s1.equals(s2)) {
			return true;
		}
		if (s1.length() != s2.length()) {
			return false;
		}
		
		// process
		char[] char1 = s1.toCharArray();
		char[] char2 = s2.toCharArray();
		Arrays.parallelSort(char1);
		Arrays.parallelSort(char2);
		String ns1 = new String(char1);
		String ns2 = new String(char2);
		
		if (!ns1.equals(ns2)) {
			return false;
		}
		
		// recursive
		for (int i=1; i<s1.length(); i++) {
			// original position
			String s11 = s1.substring(0, i);
			String s12 = s1.substring(i);
			String s21 = s2.substring(0, i);
			String s22 = s2.substring(i);
			if (isScramble(s11, s21) && isScramble(s12, s22)) {
				return true;
			}
			
			// swap position
			s21 = s2.substring(s2.length() - i);
			s22 = s2.substring(0, s2.length() - i);
			if (isScramble(s11, s21) && isScramble(s12, s22)) {
				return true;
			}	
		}
        
		return false;
    }
}

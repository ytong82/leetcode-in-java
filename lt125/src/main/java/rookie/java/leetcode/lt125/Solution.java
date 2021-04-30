package rookie.java.leetcode.lt125;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public boolean isPalindrome(String s) {
		char[] inputs = s.toCharArray();
		List<Character> str = new ArrayList<Character>();
		for (int i=0; i<inputs.length; i++) {
			if (isAlphanumeric(inputs[i])) {
				if (inputs[i] - 'A' >= 0 && inputs[i] - 'Z' <= 0) {
					str.add((char) (inputs[i] - 'A' + 'a'));
				} else {
					str.add(inputs[i]);
				}
			}
		}
		
		int N = str.size();
		int mid = N / 2;
		if (N % 2 == 0) {
			for (int i=mid-1, j=mid; i>=0 && j<N; i--, j++) {
				if (str.get(i) != str.get(j)) {
					return false;
				}
			}
		} else {
			for (int i=mid-1, j=mid+1; i>=0 && j<N; i--, j++) {
				if (str.get(i) != str.get(j)) {
					return false;
				}
			}
		}
		
		return true;
    }
	
	private boolean isAlphanumeric(Character c) {
		String regex = "^[a-zA-Z0-9]+$";
		return c.toString().matches(regex);
	}
}

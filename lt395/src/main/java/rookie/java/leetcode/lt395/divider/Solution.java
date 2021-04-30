package rookie.java.leetcode.lt395.divider;

import java.util.HashMap;
import java.util.Map;

public class Solution {
	public int longestSubstring(String s, int k) {
		if (s.length() < k) {
			return 0;
		}
		if (k <= 1) {
			return s.length();
		}
		
		Map<Character, Integer> dict = new HashMap<Character, Integer>();
		for (int i=0; i<s.length(); i++) {
			if (dict.containsKey(s.charAt(i))) {
				dict.put(s.charAt(i), dict.get(s.charAt(i)) + 1);
			} else {
				dict.put(s.charAt(i), 1);	
			}
		}
		
		Character divider = ' ';
		for (Character key : dict.keySet()) {
			if (dict.get(key) < k) {
				divider = key;
				break;
			}
		}
		
		if (divider == ' ') {
			return s.length();
		}
		
		int index = 0;
		for (int i=0; i<s.length(); i++) {
			if (s.charAt(i) == divider) {
				index = i;
				break;
			}
		}
		
		return Math.max(longestSubstring(s.substring(0, index), k), 
				longestSubstring(s.substring(index+1), k));
	}
}

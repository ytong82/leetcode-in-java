package rookie.java.leetcode.lt409;

import java.util.HashMap;
import java.util.Map;

public class Solution {
	public int longestPalindrome(String s) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (Character c : s.toCharArray()) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}
	
		int sum = 0;
		int hasEven = 0;
		for (Character c : map.keySet()) {
			if (map.get(c) % 2 == 0) {
				sum += map.get(c);
			} else {
				sum += map.get(c) -1;
				hasEven = 1;
			}
		}
		
		return sum + hasEven;
    }
}

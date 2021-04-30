package rookie.java.leetcode.lt389;

import java.util.HashMap;
import java.util.Map;

public class Solution {
	public char findTheDifference(String s, String t) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (char c : t.toCharArray()) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}
		for (char c : s.toCharArray()) {
			if (map.containsKey(c)) {
				if (map.get(c) == 1) {
					map.remove(c);
				} else {
					map.put(c, map.get(c) - 1);
				}
			} 
		}
		for (char c : map.keySet()) {
			return c;
		}
		return ' ';
    }
}

package rookie.java.leetcode.lt290;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
	public boolean wordPattern(String pattern, String s) {
        String [] words = s.split(" ");
        char[] patterns = pattern.toCharArray();
		if (words.length != patterns.length) {
			return false;
		}
        
        
        // make pattern map
        Map<Character, List<Integer>> map = new HashMap<Character, List<Integer>>();
		for (int i=0; i<patterns.length; i++) {
			if (map.containsKey(patterns[i])) {
				map.get(patterns[i]).add(i);
			} else {
				List<Integer> list = new ArrayList<Integer>();
				list.add(i);
				map.put(patterns[i], list);
			}
		}
		
		// match
		String word = "";
		for (Character c : map.keySet()) {
			List<Integer> list = map.get(c);
			if (word.equals("")) {
				word = words[list.get(0)];
			} else {
				if (words[list.get(0)].equals(word)) {
					return false;
				}
			}
		}
		
		for (Character c : map.keySet()) {
			List<Integer> list = map.get(c);
			for (Integer i : list) {
				if (!words[list.get(0)].equals(words[i])) {
					return false;
				}
			}
		}
		
		return true;
    }
}

package rookie.java.leetcode.lt30;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
	public List<Integer> findSubstring(String s, String[] words) {
		Map<String, Integer> dict = new HashMap<String, Integer>();
		List<Integer> res = new ArrayList<Integer>();
		
		int step = words[0].length();
		for (int i=0; i<s.length() - words.length * step + 1; i++) {
			int count = 0;
			dict.clear();
			for (int j=0; j<words.length; j++) {
				if (dict.containsKey(words[j])) {
					dict.put(words[j], dict.get(words[j]) + 1);
				} else {
					dict.put(words[j], 1);
				}
			}
			
			for (int j=i; j<=s.length()-step; j=j+step) {
				String key = s.substring(j, j+step);
				if (dict.containsKey(key)) {
					if (dict.get(key) >= 1) {
						dict.put(key, dict.get(key) - 1);
						count++;
					} else {
						break;
					}
					if (count == words.length) {
						res.add(i);
					}
				} else {
					break;
				}
			}
		}		
		return res;
	}
}
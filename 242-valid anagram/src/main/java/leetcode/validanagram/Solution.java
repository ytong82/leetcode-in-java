package leetcode.validanagram;

import java.util.HashMap;
import java.util.Map;

public class Solution {
	public boolean isAnagram(String s, String t) {
        Map<Character, Integer> dict = new HashMap<Character, Integer>();
        
        char[] chs = s.toCharArray();
        for (char ch : chs) {
        	if (dict.containsKey(ch)) {
        		dict.replace(ch, dict.get(ch) + 1);
        	} else {
        		dict.put(ch, 1);
        	}
        }
        
        chs = t.toCharArray();
        for (char ch : chs) {
        	if (dict.containsKey(ch)) {
        		dict.replace(ch, dict.get(ch) - 1);
        	} else {
        		return false;
        	}
        }
        
        for (Integer value : dict.values()) {
        	if (value != 0) {
        		return false;
        	}
        }
        
        return true;
    }
}

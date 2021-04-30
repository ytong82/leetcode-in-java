package rookie.java.leetcode.lt1647;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
	public int minDeletions(String s) {
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		for (int i=0; i<s.length(); i++) {
			if (charMap.containsKey(s.charAt(i))) {
				charMap.put(s.charAt(i), charMap.get(s.charAt(i)) + 1);
			} else {
				charMap.put(s.charAt(i), 1);
			}
		}
		
		List<Integer> countList = new ArrayList<Integer>();
		for (Integer val : charMap.values()) {
			countList.add(val);
		}
		Collections.sort(countList, Collections.reverseOrder());
		
		int sum = 0;
		for (int i=1; i<countList.size(); i++) {
			if (countList.get(i) == 0) {
				break;
			}
			if (countList.get(i) >= countList.get(i-1)) {
				int del;
				if (countList.get(i-1) > 0) {
					del = countList.get(i) - countList.get(i-1) + 1;
				} else {
					del = countList.get(i) - countList.get(i-1);
				}
				countList.set(i, countList.get(i) - del);
				sum += del;
			}
		}
		
		return sum;
    }
}

package leetcode.partitionlabels;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Solution {
	public List<Integer> partitionLabels(String S) {
		Map<Character, Integer> lastIndex = new HashMap<Character, Integer>();
		for (int i=0; i<S.length(); ++i) {
			char ch = S.charAt(i);
			lastIndex.put(ch, i);
		}
		
		List<Integer> res = new LinkedList<Integer>();
		
		int start = 0;
		int end = 0;
		for (int i=0; i<S.length(); ++i) {
			end = Math.max(end, lastIndex.get(S.charAt(i)));
			if (i == end) {
				res.add(end - start + 1);
				start = end + 1;
			}
		}
		
		return res;
	}
}

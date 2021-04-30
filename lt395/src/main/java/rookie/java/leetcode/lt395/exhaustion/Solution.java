package rookie.java.leetcode.lt395.exhaustion;

public class Solution {
	public int longestSubstring(String s, int k) {
		int res = 0, i = 0;
		while (i + k <= s.length()) {
			int dict[] = new int[26];
			int mask = 0;
			//int max_idx = i;
			for (int j=i; j<s.length(); j++) {
				int t = s.charAt(j) - 'a';
				dict[t]++;
				if (dict[t] < k) {
					mask = mask | 1 << t;
				} else {
					mask = mask & ~ (1 << t);
				}
				if (mask == 0) {
					res = Math.max(res, j-i+1);
					//max_idx = j;
				}
			}
			//i = max_idx + 1;
			i++;
		}
		return res;
    }
}

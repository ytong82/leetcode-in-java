package rookie.java.leetcode.lt131;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public List<List<String>> partition(String s) {
		int N = s.length();
		
		// initialize 
		boolean[][] dp = new boolean[N][N];
		for (int i=0; i<N; i++) {
			dp[i][i] = true;
			if (i < N-1 && s.charAt(i) == s.charAt(i+1)) {
				dp[i][i+1] = true;
			}
		}
		
		// dp transfer
		for (int l=3; l<=N; l++) {
			for (int i=0; i<N-l+1; i++) {
				int j = i + l - 1;
				dp[i][j] = dp[i+1][j-1] && (s.charAt(i) == s.charAt(j));
			}
		}
		return partitionHelper(s, 0, dp);
	}
	
	private List<List<String>> partitionHelper(String s, int start, boolean[][] dp) {
		if (start == s.length()) {
			List<String> list = new ArrayList<String>();
			List<List<String>> ans = new ArrayList<List<String>>();
			ans.add(list);
			return ans;
		}
		
		List<List<String>> ans = new ArrayList<List<String>>();
		for (int i=start; i<s.length(); i++) {
			if (dp[start][i]) {
				String left = s.substring(start, i+1);
				for (List<String> l : partitionHelper(s, i + 1, dp)) {
					l.add(0, left);
					ans.add(l);
				}
			}
		}
		return ans;		
	}
}

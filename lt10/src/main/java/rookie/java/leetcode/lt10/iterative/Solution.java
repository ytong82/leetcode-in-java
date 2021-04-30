package rookie.java.leetcode.lt10.iterative;

public class Solution {
	public boolean isMatch(String s, String p) {
		boolean dp[][] = new boolean[s.length()+1][p.length()+1];
		dp[0][0] = true;
		
		dp[0][1] = false;
		for (int j=2; j<=p.length(); ++j) {
			dp[0][j] = (p.charAt(j-1) == '*') && dp[0][j-2];
		}
		
		for (int i=1; i<=s.length(); ++i) {
			for (int j=1; j<=p.length(); ++j) {
				if (p.charAt(j-1) != '*') {
					if ((s.charAt(i-1) == p.charAt(j-1) || s.charAt(i-1) == '.')) {
						dp[i][j] = dp[i-1][j-1];
					}
				} else {
					if (s.charAt(i-1) == p.charAt(j-2) || p.charAt(j-2) == '.') {
						dp[i][j] = dp[i][j-2] || dp[i-1][j-2] || dp[i-1][j];
					} else {
						dp[i][j] = dp[i][j-2];
					}
				}
			}
		}

		return dp[s.length()][p.length()];
	}
}

package rookie.java.leetcode.lt44;

public class Solution {
	public boolean isMatch(String s, String p) {
		int height = s.length() + 1;
		int width = p.length() + 1;
		boolean[][] dp = new boolean[height][width];
		
		dp[0][0] = true;
		for (int j=1; j<width; j++) {
			if (p.charAt(j-1) == '*') {
				dp[0][j] = dp[0][j-1];
			} else {
				dp[0][j] = false;
			}
		}
		
		for (int i=1; i<height; i++) {
			for (int j=1; j<width; j++) {
				if (p.charAt(j-1) == '*') {
					dp[i][j] = dp[i-1][j-1] || dp[i-1][j] || dp[i][j-1];
				} else {
					if (p.charAt(j-1) == s.charAt(i-1) || p.charAt(j-1) == '?') {
						dp[i][j] = dp[i-1][j-1];
					} else {
						dp[i][j] = false;
					}
				}
			}
		}
	
		return dp[height-1][width-1];
    }
}

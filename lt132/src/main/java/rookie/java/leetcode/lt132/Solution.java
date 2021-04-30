package rookie.java.leetcode.lt132;

import java.util.Arrays;

public class Solution {
	public int minCut(String s) {
		// initialize
		int N = s.length();
		int[][] dp = new int[N][N];
		for (int[] row : dp) {
			Arrays.fill(row, N);
		}
		
		for (int i=0; i<N; i++) {
			dp[i][i] = 1;
			if (i < N-1) {
				if (s.charAt(i) == s.charAt(i+1)) {
					dp[i][i+1] = 1;
				}
			}
		}
		
		// dp transfer
		for (int l=3; l<=N; l++) {
			for (int i=0; i<N-l+1; i++) {
				int j = i + l - 1;
				if (dp[i+1][j-1] == 1 && s.charAt(i) == s.charAt(j)) {
					dp[i][j] = 1;
				}
			}
		}
		
		// another dp transfer
		for (int l=2; l<=N; l++) {
			for (int i=0; i<N-l+1; i++) {
				int j = i + l - 1;
				for (int k=i; k<j; k++) {
					dp[i][j] = Math.min(dp[i][j], dp[i][k] + dp[k+1][j]);
				}
			}
		}
	
		return dp[0][N-1] - 1;
    }
}

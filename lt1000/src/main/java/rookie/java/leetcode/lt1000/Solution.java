package rookie.java.leetcode.lt1000;

import java.util.Arrays;

public class Solution {
	public int mergeStones(int[] stones, int K) {
		int N = stones.length;
		if ((N-1) % (K-1) != 0) {
			return -1;
		}
		
		int Inf = (N / (K-1)) * 30 * 100; 
		
		// prefix sum
		int[] sums = new int[N+1];
		for (int i=1; i<=N; i++) {
			sums[i] = sums[i-1] + stones[i-1];
		}
		
		// initialize
		int[][][] dp = new int[N+1][N+1][K+1];
		for (int[][] rows : dp) {
			for (int[] row : rows) {
				Arrays.fill(row, Inf);
			}
		}
			
		for (int i=1; i<=N; i++) {
			dp[i][i][1] = 0;
		}
		
		// dp transfer
		for (int l=2; l<=N; l++) {
			for (int i=1; i<=N-l+1; i++) {
				int j = i + l - 1;
				for (int k=2; k<=K; k++) {
					for (int m=i; m<j; m++) {
						dp[i][j][k] = Math.min(dp[i][j][k], dp[i][m][1] + dp[m+1][j][k-1]);
						//System.out.printf("dp[%s][%s][%s] = %s \n", i, j, k, dp[i][j][k]);
					}
				}
				if (dp[i][j][K] < Integer.MAX_VALUE) {
					dp[i][j][1] = dp[i][j][K] + sums[j] - sums[i-1];
					//System.out.printf("dp[%s][%s][%s] = %s \n", i, j, 1, dp[i][j][1]);
				}
			}
		}
		
		// result
		return dp[1][N][1];
    }
}

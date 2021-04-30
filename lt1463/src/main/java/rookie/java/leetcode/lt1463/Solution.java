package rookie.java.leetcode.lt1463;

import java.util.Arrays;

public class Solution {
	public int cherryPickup(int[][] grid) {	
		// initialize
		int N = grid.length;
		int M = grid[0].length;
		int[][][] dp = new int[N][M][M];
		for (int[][] matrix : dp) {
			for (int[] row : matrix) {
				Arrays.fill(row, Integer.MIN_VALUE);
			}
		}
		dp[0][0][M-1] = grid[0][0] + grid[0][M-1];		
		
		// dp transfer
		for (int i=1; i<N; i++) {
			for (int j=0; j<M; j++) {
				for (int m=-1; m<=1; m++) {
					int x = j + m;
					if (x < 0 || x >= M) {
						continue;
					}
					for (int k=0; k<M; k++) {
						for (int n=-1; n<=1; n++) {
							int y = k + n;
							if (y < 0 || y >= M) {
								continue;
							}
							if (j == k) {
								dp[i][j][k] = Math.max(dp[i][j][k], dp[i-1][x][y] + grid[i][j]);
							} else {
								dp[i][j][k] = Math.max(dp[i][j][k], dp[i-1][x][y] + grid[i][j] + grid[i][k]);
							}
						}
					}
				}
			}
		}
		
		// return
		int maxVal = 0;
		for (int j=0; j<M; j++) {
			for (int k=0; k<M; k++) {
				maxVal = Math.max(maxVal, dp[N-1][j][k]);
			}
		}
        return maxVal;
	}
}

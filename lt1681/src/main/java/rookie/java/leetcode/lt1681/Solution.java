package rookie.java.leetcode.lt1681;

import java.util.Arrays;

public class Solution {
	public int minimumIncompatibility(int[] nums, int k) {
		int N = nums.length;
		int M = 1 << N;
		int C = N / k;
		
		// initialize dp
		// dp[i][j] the sequence end with i, have combination by j before it. 
		// eg. j is 3, [0,1,1], dp[1][5] is the sequence ended with nums[5], 
		// 		with nums[1] and nums[2] selected before nums[5]
		int[][] dp = new int[N][M];
		for (int[] row: dp) {
			Arrays.fill(row, N * N);
		}
		for (int i=0; i<N; i++) {
			dp[i][1<<i] = 0;
		}
		
		// dp transfer
		for (int s=0; s<M; s++) {
			for (int i=0; i<N; i++) {
				if (((s >> i) & 1) == 1) {
					for (int j=0; j<N; j++) {
						if (((s >> j) & 1) == 0) {
							int t = s | (1 << j);
							if (Integer.bitCount(s) % C == 0) {
								dp[j][t] = Math.min(dp[j][t], dp[i][s]);
							} else if (nums[j] > nums[i]) {
								dp[j][t] = Math.min(dp[j][t], dp[i][s] + nums[j] - nums[i]); 
							}
						}
					}
				}
			}
		}
		
		// return
		int min = N * N;
		for (int i=0; i<N; i++) {
			if (dp[i][M-1] >= 0) {
				min = dp[i][M-1] < min ? dp[i][M-1] : min;
			}
		}
		
		return min >= N * N ? -1 : min;
    }
}

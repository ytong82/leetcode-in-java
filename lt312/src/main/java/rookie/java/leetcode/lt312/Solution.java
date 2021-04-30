package rookie.java.leetcode.lt312;

public class Solution {
	public int maxCoins(int[] nums) {
		// initialize
		int N = nums.length;
		int[] NUMS = new int[N+2];
		for (int i=0; i<N; i++) {
			NUMS[i+1] = nums[i];
		}
		NUMS[0] = 1;
		NUMS[N+1] = 1;
			
		// dp transfer
		int[][] dp = new int[N+2][N+2];
		for (int len=1; len<=N; len++) {
			for (int i=1; i<=N-len+1; i++) {
				int j = i + len - 1;
				for (int k=i; k<=j; k++) {
					dp[i][j] = Math.max(dp[i][j], dp[i][k-1] + dp[k+1][j] + NUMS[i-1] * NUMS[k] * NUMS[j+1]);
				}
			}
		}
		
		// return
		return dp[1][N];
    }
}

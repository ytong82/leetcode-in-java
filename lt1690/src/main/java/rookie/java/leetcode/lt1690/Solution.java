package rookie.java.leetcode.lt1690;

public class Solution {
	public int stoneGameVII(int[] stones) {
		// calculate prefix sum
		int N = stones.length;
		int[] sums = new int[N+1];
		for (int i=1; i<=stones.length; i++) {
			sums[i] = sums[i-1] + stones[i-1];
		}
		
		// dp transfer
		int[][] dp = new int[N+1][N+1];
		for (int i=1; i<=N; i++) {
			dp[i][i] = 0;
		}
		
		for (int len=2; len<=N; len++) {
			for (int i=1; i<=N-len+1; i++) {
				int j = i + len - 1;
				dp[i][j] = Math.max(sums[j] - sums[i] - dp[i+1][j], sums[j-1] - sums[i-1] - dp[i][j-1]);
			}
		}
		
		// return
		return dp[1][N]; 
	}
}

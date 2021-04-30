package rookie.java.leetcode.lt877;

public class Solution {
	 public boolean stoneGame(int[] piles) {
		 // dp[i][j][k] - piles in range[i,j] have been taken
		 // [k] means 0 - last taken Alex, 1 - last taken by Lee
		 int N = piles.length;
		 int[][][] dp = new int[N][N][2];
		 int sum = 0;
		 for (int i=0; i<N; i++) {
			 dp[i][i][0] = 0;
			 dp[i][i][1] = piles[i];
			 sum += piles[i];
		 }
		 
		 // dp transfer
		 for (int l=2; l<=N; l++) {
			 for (int i=0; i<N-l+1; i++) {
				 int j = i + l - 1;
				 dp[i][j][0] = Math.max(piles[i] - dp[i+1][j][1], piles[j] - dp[i][j-1][1]);
				 dp[i][j][1] = Math.max(piles[i] - dp[i+1][j][0], piles[j] - dp[i][j-1][0]);
			 }
		 }
		 
		 // return
		 return sum - dp[0][N-1][0] > dp[0][N-1][0];
	 }
}

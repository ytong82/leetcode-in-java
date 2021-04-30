package rookie.java.leetcode.lt121.dp;

public class Solution {
	public int maxProfit(int[] prices) {
		int N = prices.length;
		int K = 1;
		
		// initialize 
		int[][] kept = new int[N+1][K+1];
		int[][] sold = new int[N+1][K+1];
		for (int k=0; k<=K; k++) {
			kept[0][k] = Integer.MIN_VALUE;
			sold[0][k] = 0;
		}
		for (int i=1; i<=N; i++) {
			kept[i][0] = Integer.MIN_VALUE;;
			sold[i][0] = 0;
		}
		
		// dp transfer
		for (int i=1; i<=N; i++) {
			for (int k=1; k<=K; k++) {
				kept[i][k] = Math.max(kept[i-1][k], sold[i-1][k-1] - prices[i-1]);
				sold[i][k] = Math.max(sold[i-1][k], kept[i-1][k] + prices[i-1]);
			}
		}
		
		// return
		int max = 0;
		for (int k=0; k<=K; k++) {
			max = Math.max(max, sold[N][k]);
		}
		return max;
    }
}

package rookie.java.leetcode.lt121.greedy;

public class Solution {
	public int maxProfit(int[] prices) {
		int[] dp = new int[prices.length];
		int minValue = Integer.MAX_VALUE;
 		for (int i=0; i<prices.length; i++) {			
			if (minValue > prices[i]) {
				minValue = prices[i];
			}
			dp[i] = prices[i] - minValue;
		}
		
 		int maxProfit = 0;
 		for (int i=0; i<prices.length; i++) {
 			if (maxProfit < dp[i]) {
 				maxProfit = dp[i];
 			}
 		}
 		return maxProfit;
    }
}

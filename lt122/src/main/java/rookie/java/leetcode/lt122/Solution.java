package rookie.java.leetcode.lt122;

public class Solution {
	public int maxProfit(int[] prices) {
		int N = prices.length;
		
		// initialize
		int kept[] = new int[N+1];
		int sold[] = new int[N+1];
		kept[0] = Integer.MIN_VALUE;
		sold[0] = 0;
		
		// dp transfer
		for (int i=1; i<=N; i++) {
			kept[i] = Math.max(kept[i-1], sold[i-1] - prices[i-1]);
			sold[i] = Math.max(sold[i-1], kept[i-1] + prices[i-1]);
		}
		
		return sold[N];
    }
}

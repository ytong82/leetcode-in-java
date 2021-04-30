package rookie.java.leetcode.lt714;

public class Solution {
	public int maxProfit(int[] prices, int fee) {	
		int N = prices.length;
		int MIN_PRICE = 0;
		for (int price : prices) {
			MIN_PRICE = Math.max(MIN_PRICE, price);
		}
		MIN_PRICE = - MIN_PRICE;
		
		// initialize
		int kept[] = new int[N+1];
		int sold[] = new int[N+1];
		kept[0] = MIN_PRICE;
		sold[0] = 0;
		
		// dp transfer
		for (int i=1; i<=N; i++) {
			kept[i] = Math.max(kept[i-1], sold[i-1] - prices[i-1]);
			sold[i] = Math.max(sold[i-1], kept[i-1] + prices[i-1] - fee);
		}
		
		return sold[N];
    }
}

package rookie.java.leetcode.lt309;

public class Solution {
	 public int maxProfit(int[] prices) {
		 // check input
		 int k = prices.length;
		 if (k < 1) {
			 return 0;
		 }
		 
		 int[] kept = new int[k+1];
		 int[] sold = new int[k+1];
		 
		 // initial value
		 sold[0] = 0;
		 kept[0] = Integer.MIN_VALUE;
		 sold[1] = 0;
		 kept[1] = -prices[0];
		 
		 for (int i=2; i<=k; i++) {
			 kept[i] = Math.max(kept[i-1], sold[i-2] - prices[i-1]);
			 sold[i] = Math.max(sold[i-1], kept[i-1] + prices[i-1]);
		 }
		
		 return sold[k];
	 }
}
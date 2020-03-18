package leetcode.coinchange;

public class Solution {
	public int coinChange(int[] coins, int amount) {
		int[] res = new int[amount+1];
				
		for (int i=1; i<=amount; ++i) {
			int min = amount + 1;
			for (int j=0; j<coins.length; ++j) {
				if (i - coins[j] >= 0) {
					int count = res[i-coins[j]] + 1;
					if (min > count) {
						min = count;
					}
				}
			}
			res[i] = min;
		}
		
		if (res[amount] == amount + 1) {
			return -1;
		}
		
		return res[amount];
	}
}

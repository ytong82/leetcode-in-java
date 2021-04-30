package rookie.java.leetcode.lt338;

public class Solution {
	public int[] countBits(int num) {
		int[] dp = new int[num+1];
		if (num >= 2) {
			dp[0] = 0;
			dp[1] = 1;
			
			int j = 1;
			int power = (int) Math.pow(2, j);
			for (int i=2; i<=num; i++) {
				if (i >= power * 2) {
					j++;
					power = (int) Math.pow(2, j);
				}
				dp[i] = dp[i-power] + 1;
			}
		} else if (num == 1) {
			dp[0] = 0;
			dp[1] = 1;
		} else {
			dp[0] = 0;
		}
		return dp;
    }
}

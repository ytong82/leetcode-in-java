package rookie.java.leetcode.lt279;

public class Solution {
	public int numSquares(int n) {
		double sqrt = Math.sqrt(n);
		int floor = (int) Math.floor(sqrt);
		
		int[] dp = new int[n+1];
		dp[0] = 0;
		
		for (int i=1; i<=n; i++) {
			int minValue = Integer.MAX_VALUE;
			for (int j=1; j<=floor; j++) {
				int pivot = i - j * j;
				if (pivot >= 0) {
					if (minValue > dp[pivot]) {
						minValue = dp[pivot];
					}
				} else {
					break;
				}
				dp[i] = minValue + 1;
			}
		}
		
		return dp[n];
	}
}

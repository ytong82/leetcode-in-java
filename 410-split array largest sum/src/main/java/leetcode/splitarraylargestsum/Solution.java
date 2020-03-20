package leetcode.splitarraylargestsum;

public class Solution {
	public int splitArray(int[] nums, int m) {
		int n = nums.length;
		int[] sums = new int[n];
		int[][] dp = new int[m][n];
		
		for (int i=0; i<m; ++i) {
			for (int j=0; j<n; ++j) {
				dp[i][j] = Integer.MAX_VALUE;
			}
		}
		
		for (int i=0; i<n; ++i) {
			if (i == 0) {
				sums[0] = nums[0];
			} else {
				sums[i] = sums[i-1] + nums[i];
			}
		}
		
		for (int i=0; i<m; ++i) {
			for (int j=0; j<n; ++j) {
				if (i == 0) {
					dp[i][j] = sums[j];
				} else {
					for (int k=i-1; k<j; ++k) {
						int val = Math.max(dp[i-1][k], sums[j] - sums[k]);
						dp[i][j] = Math.min(dp[i][j], val);
					}
				}
			}
		}
		return dp[m-1][n-1];
	}
}

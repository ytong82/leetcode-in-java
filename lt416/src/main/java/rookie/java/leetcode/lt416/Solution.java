package rookie.java.leetcode.lt416;

public class Solution {
	public boolean canPartition(int[] nums) {
		int sum = 0;
		for (int i=0; i<nums.length; i++) {
			sum += nums[i];
		}
		double halfsum = sum / 2.0;
		int target = 0;
		if (Math.round(halfsum) == halfsum) {
			target = (int)Math.round(halfsum);
		} else {
			return false;
		}
		
		boolean[] dp = new boolean[target+1];
		dp[0] = true;
		for (int i=0; i<nums.length; i++) {
			boolean[] temp = new boolean[target+1];
			temp[0] = true;
			for (int j=0; j<=target; j++) {
				int pivot = j - nums[i];
				if (pivot >= 0 && dp[pivot]) {
					temp[j] = true;
				}
			}
			for (int j=0; j<=target; j++) {
				dp[j] = dp[j] || temp[j];
			}
		}
		return dp[target];
    }
}

package rookie.java.leetcode.lt53.divider;

public class Solution {
	public int maxSubArray(int[] nums) {
		return maxSubArray(nums, 0, nums.length - 1);
	}
	
	private int maxSubArray(int[] nums, int left, int right) {
		int index = -1;
		int temp = 0;
		int res = Integer.MIN_VALUE;
		for (int i=left; i<=right; i++) {
			if (temp + nums[i] < nums[i]) {
				index = i;
				break;
			} else {
				temp += nums[i];
				res = temp > res ? temp : res;
			}
		}
		
		if (index == -1) {
			return res;
		} else {
			return Math.max(maxSubArray(nums, left, index - 1), 
					maxSubArray(nums, index, right));
		}
	}
}

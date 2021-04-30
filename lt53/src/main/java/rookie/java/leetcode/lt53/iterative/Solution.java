package rookie.java.leetcode.lt53.iterative;

public class Solution {
	public int maxSubArray(int[] nums) {
		int res = Integer.MIN_VALUE;
		int temp = 0;
		
		for (int i=0; i<nums.length; i++) {
			temp = Math.max(temp + nums[i], nums[i]);
			res = temp > res ? temp : res;
		}
		return res;
	}
}

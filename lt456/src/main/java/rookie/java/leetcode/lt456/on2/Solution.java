package rookie.java.leetcode.lt456.on2;

public class Solution {
	public boolean find132pattern(int[] nums) {
		int minVal = Integer.MAX_VALUE;
		
		for (int i=0; i<nums.length; i++) {
			if (minVal > nums[i]) {
				minVal = nums[i];
			}
			if (minVal < nums[i]) {
				if (searchTheTwo(minVal, nums, i)) {
					return true;
				}
			}
		}
		return false;
    }
	
	private boolean searchTheTwo(int one, int[] nums, int index) {
		for (int i=index+1; i<nums.length; i++) {
			if (nums[i] > one && nums[i] < nums[index]) {
				return true;
			}
		}
		return false;
	}
}

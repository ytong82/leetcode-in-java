package leetcode.findpeakelement;

public class Solution {
	public int findPeakElement(int[] nums) {
		if (nums.length == 1) {
			return 0;
		}
		
		for (int index=0; index<nums.length; ++index) {
			if (index == 0) {
				if (nums[index] > nums[index+1]) {
					return index;
				}
			} else if (index == nums.length - 1) {
				if (nums[index] > nums[index-1]) {
					return index;
				}
			} else {
				if (nums[index] > nums[index-1] && nums[index] > nums[index+1]) {
					return index;
				}
			}
		}
		return -1;
	}
}

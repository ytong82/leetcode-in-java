package rookie.java.leetcode.lt35;

public class Solution {
	public int searchInsert(int[] nums, int target) {
		int left = 0;
		int right = nums.length - 1;
		
		if (target > nums[nums.length-1]) {
			return nums.length;
		} else if (target < nums[0]) {
			return 0;
		}

		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (nums[mid] == target) {
				return mid;
			}
			if (left == right) {
				if (target < nums[left]) {
					return left;
				} else {
					return left + 1;
				}
			}
			
			if (nums[mid] > target) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
			
		}
		return left;
    }
}

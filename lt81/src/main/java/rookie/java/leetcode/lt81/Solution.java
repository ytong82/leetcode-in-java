package rookie.java.leetcode.lt81;

public class Solution {
	public boolean search(int[] nums, int target) {
		return binarySearch(nums, 0, nums.length-1, target);
	}
	
	private boolean binarySearch(int[] nums, int left, int right, int target) {
		if (left <= right) {
			int mid = left + (right - left) / 2;
			if (target == nums[mid]) {
				return true;
			} else {
				// left ordered
				if (nums[left] < nums[mid]) {
					if (nums[left] <= target && target < nums[mid]) {
						right = mid - 1;
					} else {
						left = mid + 1;
					}
				// right ordered
				} else if (nums[left] > nums[mid]){
					if (nums[mid] < target && target <= nums[right]) {
						left = mid + 1;
					} else {
						right = mid - 1;
					}
				} else {
					left++;
				}
				return binarySearch(nums, left, right, target);
			}
		}
		return false;
	}
}
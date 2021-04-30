package rookie.java.leetcode.lt33.iterative;

public class Solution {
	public int search(int[] nums, int target) {
		int left = 0;
		int right = nums.length-1;
		
		while(left <= right) {  
			int middle = left + (right-left) / 2;
			if(target == nums[middle]) {
				return middle;
			}
			
			if(nums[middle] >= nums[left]) {
				if(nums[left] <= target && target < nums[middle]) {
					right = middle - 1;
				} else {
					left = middle + 1;
				}
			} else {
				if(target > nums[middle] && target <= nums[right] ) {
					left = middle+1;
				} else {
					right = middle-1;
				}
			}
		}
		return -1;
	}
}

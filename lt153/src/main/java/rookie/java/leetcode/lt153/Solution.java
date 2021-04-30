package rookie.java.leetcode.lt153;

public class Solution {
	 public int findMin(int[] nums) {
		 if (nums.length == 1) {
			 return nums[0];
		 }
		 
		 int index = binarySearch(nums, 0, nums.length - 1);
		 if (index == nums.length-1) {
			 index = -1;
		 }
		 return nums[index+1];
	 }
	 
	 private int binarySearch(int[] nums, int left, int right) {
		 if (left <= right) {
			 int mid = left + (right - left) / 2;
			 if (nums[mid] > nums[mid+1]) {
				 return mid;
			 } else {
				 if (nums[mid] < nums[right]) {
					 right = mid;
				 } else if (nums[mid] > nums[right]) {
					left = mid + 1; 
				 } else {
					 right--;
				 }
			 }
			 return binarySearch(nums, left, right);
		 }
		 return -1;
	 }
}

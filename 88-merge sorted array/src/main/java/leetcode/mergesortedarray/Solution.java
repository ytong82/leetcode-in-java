package leetcode.mergesortedarray;

public class Solution {
	public void merge(int[] nums1, int m, int[] nums2, int n) {
		int index = 0;
		int index1 = 0;
		int index2 = 0;
		int numLen = m;
		while (index1 < m && index2 < n) {
			if (nums1[index] > nums2[index2]) {
				this.insertToNumsOne(nums1, numLen, index, nums2[index2]);
				index2++;
				numLen++;
			} else {
				index1++;
			}
			index++;
		}
		
		if (index2 < n) {
			this.appendToNumsOne(nums1, nums2, n, index, index2);
		}
	}
	
	private void insertToNumsOne(int[] nums, int numLen, int index, int value) {
		for (int i=numLen; i>index; i--) {
			nums[i] = nums[i-1];
		}
		nums[index] = value;
	}
	
	private void appendToNumsOne(int[] nums, int[] nums2, int n, int index, int index2) {
		while (index2 < n) {
			nums[index] = nums2[index2];
			index++;
			index2++;
		}
	}
}

package leetcode.quicksort;

public class Solution {
	public int findKthLargest(int[] nums, int k) {
		int kthLargestIndex= nums.length - k;
		int kthLargest = this.doQuickSort(nums, 0, nums.length - 1, kthLargestIndex);
		return kthLargest;
	}
	
	private int doPartition(int[] nums, int left, int right) {
		int pivot = nums[left];
		int upperLeft = left;
		
		for (int index=left+1; index<=right; ++index) {
			if (pivot > nums[index]) {
				upperLeft++;
				this.doSwap(nums, upperLeft, index);
			}
		}
		this.doSwap(nums, left, upperLeft);
		return upperLeft;
	}
	
	private void doSwap(int[] nums, int i, int j) {
		if (i != j) {
			int temp = nums[i];
			nums[i] = nums[j];
			nums[j] = temp;
		}
	}
	
	private int doQuickSort(int[] nums, int left, int right, int kthLargestIndex) {
		if (left < right) {
          	int pivotIndex = this.doPartition(nums, left, right);
          	if (pivotIndex == kthLargestIndex) {
          		return nums[kthLargestIndex];
          	}
			this.doQuickSort(nums, left, pivotIndex - 1, kthLargestIndex);
			this.doQuickSort(nums, pivotIndex + 1, right, kthLargestIndex);
		}
		return nums[kthLargestIndex];
	}

}

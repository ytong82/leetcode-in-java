package rookie.java.leetcode.lt31;

import java.util.Arrays;

public class Solution {
	public void nextPermutation(int[] nums) {
		int index = -1;
        for (int i=nums.length-1; i>=1; i--) {
        	if (nums[i-1] < nums[i]) {
        		index = i - 1;
        		break;
        	}
        }
        
        if (index >= 0) {
	        int minGap = Integer.MAX_VALUE;
	        int swap = -1;
	        for (int i=index+1; i<nums.length; i++) {
	        	int gap = nums[i] - nums[index];
	        	if (gap > 0 && minGap >= gap) {
	        		minGap = gap;
	        		swap = i;
	        	}
	        }
	        swap(nums, index, swap);
        }
        
	    transpose(nums, index);     
        System.out.println(Arrays.toString(nums));
    }
	
	private void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
	
	private void transpose(int[] nums, int pos) {
		for (int i=pos+1, j=nums.length-1; i<j; i++, j--) {
			int temp = nums[i];
			nums[i] = nums[j];
			nums[j] = temp;
			
		}
	}
}

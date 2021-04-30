package rookie.java.leetcode.lt473;

import java.util.Arrays;

public class Solution {
	private long border;
	
	public boolean makesquare(int[] nums) {
		int[] borders = new int[4];
		try {
			this.border = this.getBorder(nums);
		} catch (IllegalArgumentException ex) {
			//ex.printStackTrace();
			return false;
		}
		if (this.border <= 0) {
			return false;
		}

		Arrays.setAll(nums, i -> ~nums[i]);
		Arrays.sort(nums);
		Arrays.setAll(nums, i -> ~nums[i]);
		
		for (int num : nums) {
			System.out.printf("%s ", num);
		}
		
		return this.makeSquare(nums, borders, 0);
    }
	
	private boolean makeSquare(int[] nums, int[] borders, int pivot) {
		if (pivot == nums.length) {
			return this.validateSquare(nums, borders);
		} else {
			if (this.checkSquare(nums, borders)) {
				boolean isSquare = false;
				for (int i=0; i<4; i++) {
					borders[i] += nums[pivot];
					isSquare = isSquare || this.makeSquare(nums, borders, pivot+1);
					borders[i] -= nums[pivot];
				}
				return isSquare;
			} else {
				return false;
			}
		}
	}
	
	private boolean checkSquare(int[] nums, int[] borders) {		
		for (int i=0; i<borders.length; i++) {
			if (borders[i] > this.border) {
				return false;
			}
		}
		return true;
	}
	
	private boolean validateSquare(int[] nums, int[] borders) {
		for (int i=0; i<borders.length; i++) {
			if (borders[i] != this.border) {
				return false;
			}
		}
		return true;
	}
	
	
	private long getBorder(int[] nums) throws IllegalArgumentException{
		long sum =0;
		for (int i=0; i<nums.length; i++) {
			sum += nums[i];
		}
		
		double border = sum / 4.0;
		if (Math.round(border) == border) {
			return Math.round(border);
		} else {
			throw new IllegalArgumentException();
		}
	}
}

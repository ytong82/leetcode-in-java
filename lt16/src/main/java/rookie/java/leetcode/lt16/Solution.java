package rookie.java.leetcode.lt16;

import java.util.Arrays;

public class Solution {
	public int threeSumClosest(int[] nums, int target) {
		int minCloset = Integer.MAX_VALUE;
		int closestSum = 0;
		Arrays.parallelSort(nums);
		
		for (int i=0; i<nums.length-2; i++) {
			int left = i+1;
			int right = nums.length - 1;
			while (left < right) {
				int sum = nums[i] + nums[left] + nums[right];
				int closet = Math.abs(sum - target);
				if (minCloset > closet) {
					minCloset = closet;
					closestSum = sum;
				}
				if (sum < target) {
					left++;
				} else {
					right--;
				}
			}
		}
		return closestSum;
    }
}

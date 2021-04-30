package rookie.java.leetcode.lt18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
	public List<List<Integer>> fourSum(int[] nums, int target) {
		List<List<Integer>> reses = new ArrayList<List<Integer>>();
		Arrays.parallelSort(nums);
		for (int i=0; i<nums.length-3; i++) {
			for (int j=i+1; j<nums.length-2; j++) {
				int left = j + 1;
				int right = nums.length - 1;
				while (left < right) {
					int sum = nums[i] + nums[j] + nums[left] + nums[right];
					if (sum == target) {
						List<Integer> res = new ArrayList<Integer>();
						res.add(nums[i]);
						res.add(nums[j]);
						res.add(nums[left]);
						res.add(nums[right]);
						if (!reses.contains(res)) {
							reses.add(res);
						}
						left++;
						right--;
					} else if (sum < target) {
						left++;
					} else {
						right--;
					}
				}
			}
		}
		return reses;
    }
}

package rookie.java.leetcode.lt90;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
	Set<List<Integer>> subsets = new HashSet<List<Integer>>();
	public List<List<Integer>> subsetsWithDup(int[] nums) {
		// recursive
		Arrays.sort(nums);
		subsetsWithDup(nums, 0, new ArrayList<Integer>()); 
		
		// return
		List<List<Integer>> sublists = new ArrayList<List<Integer>>();
		for (List<Integer> subset : subsets) {
			sublists.add(subset);
		}
		return sublists;
	}
	 
	private void subsetsWithDup(int[] nums, int l, List<Integer> subset) {
		if (l == nums.length) {
			subsets.add(subset);
		} else {
			List<Integer> newSubset = new ArrayList<Integer>();
			for (Integer item : subset) {
				newSubset.add(item);
			}
			newSubset.add(nums[l]);
			subsetsWithDup(nums, l+1, newSubset);
			subsetsWithDup(nums, l+1, subset);
		}
	}
}

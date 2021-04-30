package rookie.java.leetcode.lt47;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {
	public List<List<Integer>> permuteUnique(int[] nums) {
		List<List<Integer>> resList;
		List<Integer> numsList = new ArrayList<Integer>();
		for (int i=0; i<nums.length; i++) {
			numsList.add(nums[i]);
		}
			
		resList = this.__permuteUnique(numsList);		
		List<List<Integer>> retList = new ArrayList<List<Integer>>();
		for (List<Integer> list: resList) {
			if (!retList.contains(list)) {
				retList.add(list);
			}
		}
		
		return retList;
    }
	
	private List<List<Integer>> __permuteUnique(List<Integer> nums) {	
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		if (nums.size() == 1) {
			List<Integer> resList = new LinkedList<Integer>();
			resList.add(nums.get(0));
			res.add(resList);
		} else {
			for (int i=0; i<nums.size(); i++) {
				List<Integer> subNums = new ArrayList<Integer>();
				for (int j=0; j<nums.size(); j++) {
					if (j != i) {
						subNums.add(nums.get(j));
					}
				}
				List<List<Integer>> subRes = __permuteUnique(subNums);
				for (List<Integer> subResList : subRes) {
					List<Integer> subList = new ArrayList<Integer>();
					subList.add(nums.get(i));
					for (Integer item : subResList) {
						subList.add(item);
					}
					res.add(subList);
				}
			}
		}
		return res;
	}
}

package leetcode.firstmissingpositive;

import java.util.HashMap;
import java.util.Map;

public class Solution {
	public int firstMissingPositive(int[] nums) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for (int i=0; i<nums.length; ++i) {
			if (nums[i] > 0) {
				map.put(nums[i], 0);
			}
		}
		
		int index = 1;
		while (true) {
			if (map.containsKey(index)) {
				index++;
			} else {
				break;
			}
		}
			
		return index;
	}
}

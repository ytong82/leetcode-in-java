package rookie.java.leetcode.lt1679;

import java.util.HashMap;
import java.util.Map;

public class Solution {
	public int maxOperations(int[] nums, int k) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i=0; i<nums.length; i++) {
			if (map.containsKey(nums[i])) {
				map.put(nums[i], map.get(nums[i]) + 1);
			} else {
				map.put(nums[i], 1);
			}
		}
		int count = 0;
		for (Integer key : map.keySet()) {
			int other = k - key;
			if (key == other) {
				count += (map.get(key) / 2) * 2;
			} else {
				if (map.containsKey(other)) {
					count += Math.min(map.get(key), map.get(other));
				}
			}
		}
		return count / 2;
    }
}

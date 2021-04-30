package rookie.java.leetcode.lt217;

import java.util.HashMap;
import java.util.Map;

public class Solution {
	public boolean containsDuplicate(int[] nums) {
		Map<Integer, Boolean> map = new HashMap<Integer, Boolean>();
		for (int num : nums) {
			if (map.containsKey(num)) {
				return true;
			} else {
				map.put(num, true);
			}
		}
		return false;
    }
}

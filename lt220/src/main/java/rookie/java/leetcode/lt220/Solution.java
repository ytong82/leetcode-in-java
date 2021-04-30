package rookie.java.leetcode.lt220;

import java.util.TreeSet;

public class Solution {
	public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
		// prepare
		int N = nums.length;
		TreeSet<Long> set = new TreeSet<Long>();
		
		// process
		for (int i=0; i<N; i++) {
			long num = (long)nums[i];
			
			Long floor = set.floor(num);
			Long ceiling = set.ceiling(num);
			
			if (floor != null && Math.abs(num - floor) <= t) {
				return true;
			}
			
			if (ceiling != null && Math.abs(ceiling - num) <= t) {
				return true;
			}
			
			set.add(num);
			if (set.size() > k) {
				set.remove((long)nums[i-k]);
			}
		}
		return false;
	}
}

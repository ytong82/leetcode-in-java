package rookie.java.leetcode.lt1492;

import java.util.HashSet;
import java.util.Set;

public class Solution {
	public int kthFactor(int n, int k) {
		Set<Integer> set = new HashSet<Integer>();
		for (int i=1; i<=n/2; i++) {
			if (n % i == 0) {
				set.add(i);
				if (set.size() == k) {
					return i;
				}
			}
		}
		
		if (set.size() + 1 == k) {
			return n;
		} else {
			return -1;
		}
	}
}

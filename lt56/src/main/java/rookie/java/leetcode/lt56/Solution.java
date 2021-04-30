package rookie.java.leetcode.lt56;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Solution {
	public int[][] merge(int[][] intervals) {
		// sort
		class IntervalComparator implements Comparator<int[]> {
			@Override
			public int compare(int[] item, int[] item2) {
				if (item[0] == item2[0]) {
					return item[1] - item2[1];
				} else {
					return item[0] - item2[0];
				}
			}
		}
		Arrays.sort(intervals, new IntervalComparator());
		
		// merge
		List<int[]> merges = new LinkedList<int[]>();
		for (int i=0; i<intervals.length; i++) {
			this.merge(merges, intervals[i]);
		}
        
		int[][] res = new int[merges.size()][2];
		for (int i=0; i<res.length; i++) {
			res[i] = merges.get(i);
		}
		return res;
    }
	
	private void merge(List<int[]> merges, int[] curr) {
		if (merges.size() == 0) {
			merges.add(curr);
		} else {
			int[] prev = merges.get(merges.size()-1);
			if (prev[1] >= curr[0]) {
				prev[0] = Math.min(prev[0], curr[0]);
				prev[1] = Math.max(prev[1], curr[1]);
			} else {
				merges.add(curr);
			}
		}
	}
}

package rookie.java.leetcode.lt57;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Stack;

public class Solution {
	class Range {
		int start;
		int end;
		
		Range(int start, int end) {
			this.start = start;
			this.end = end;
		}
		
		boolean isOverlapped(Range r) {
			if (r.start >= this.start && r.start <= this.end) {
				return true;
			}
			if (r.end >= this.start && r.end <= this.end) {
				return true;
			}
			if (r.start <= this.start && r.end >= this.end) {
				return true;
			}
			if (r.start >= this.start && r.end <= this.end) {
				return true;
			}
			return false;
		}
		
		Range merge(Range r) {
			if (r.start <= this.start && r.end >= this.end) {
				return new Range(r.start, r.end);
			}
			if (r.start >= this.start && r.end <= this.end) {
				return new Range(this.start, this.end);
			}
			if (r.start >= this.start && r.start <= this.end) {
				return new Range(this.start, r.end);
			}
			if (r.end >= this.start && r.end <= this.end) {
				return new Range(r.start, this.end);
			}
			return null;
		}
		
		boolean isBefore(Range r) {
			if (r.end > this.start) {
				return true;
			} else {
				return false;
			}
		}
	}
	public int[][] insert(int[][] intervals, int[] newInterval) {
		// sort ranges
		List<Range> ranges = new ArrayList<Range>();
		for (int i=0; i<intervals.length; i++) {
			ranges.add(new Range(intervals[i][0], intervals[i][1]));
		}
		Collections.sort(ranges, new Comparator<Range>() {
			public int compare(Range r1, Range r2) {
				if (r1.start == r2.start) {
					return r1.end - r2.end;
				} else {
					return r1.start - r2.start;
				}
			}
		});
		
		// stack
		Stack<Range> stack = new Stack<Range>();
		Stack<Range> outputStack = new Stack<Range>();
		
		for (Range range : ranges) {
			stack.add(range);
		}
			
		// put new range
		Range newRange = new Range(newInterval[0], newInterval[1]);
		while (!stack.isEmpty()) {
			Range curr = stack.pop();
			if (curr.isOverlapped(newRange)) {
				newRange = curr.merge(newRange);
			} else {
				if (curr.isBefore(newRange)) {
					stack.push(curr);
					break;
				} else {
					outputStack.push(curr);
				}
			}
		}
		
		outputStack.push(newRange);
		while (!stack.isEmpty()) {
			outputStack.push(stack.pop());
		}
			
		// output
		int size = outputStack.size();	
		int[][] res = new int[size][2];
		int index = 0;
		while (!outputStack.empty()) {
			Range curr = outputStack.pop();
			res[index][0] = curr.start;
			res[index][1] = curr.end;
			index++;
		}
		
		return res;
    }
}

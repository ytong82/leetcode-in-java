package rookie.java.leetcode.lt84.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {
	public int largestRectangleArea(int[] heights) {
		// initialize
		int N = heights.length;
		Deque<Integer> stack = new ArrayDeque<Integer>();
		
		// run
		int maxArea = 0;
		int start = -1;
		for (int i=0; i<=N; i++) {
			if (i == N) {
				while (!stack.isEmpty() && heights[stack.peekFirst()] == 0) {
					start = stack.pollFirst();
				}
				while (!stack.isEmpty()) {
					int j = stack.pollLast();
					int height = heights[j];
					if (stack.isEmpty()) {
						maxArea = Math.max(maxArea, height * (i - start - 1));
					} else {
						maxArea = Math.max(maxArea, height * (i - stack.peekLast() -1));
					}
				}
			} else {
				while (!stack.isEmpty() && heights[stack.peekLast()] > heights[i]) {
					int j = stack.pollLast();
					int height = heights[j];
					if (stack.isEmpty()) {
						maxArea = Math.max(maxArea, height * i);
					} else {
						maxArea = Math.max(maxArea, height * (i - stack.peekLast() - 1));
					}
				}
				stack.addLast(i);
			}
		}
		
		// return
		return maxArea;
	}
}

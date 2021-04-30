package rookie.java.leetcode.lt84.greedy;

public class Solution {
	public int largestRectangleArea(int[] heights) {
		int max = 0;
		for (int i=0; i<heights.length; i++) {
			int left = i - 1;
			for (; left>=0; left--) {
				if (heights[left] < heights[i]) {
					break;
				}
			}
			int right = i + 1;
			for (; right<heights.length; right++) {
				if (heights[right] < heights[i]) {
					break;
				}
			}
			max = Math.max(max, heights[i] * (right - left - 1));
		}	
		return max;
    }
}

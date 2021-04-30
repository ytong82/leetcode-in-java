package rookie.java.leetcode.lt85;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {
	int maximalRectangle(char[][] matrix) {
		// process matrix
		if (matrix.length == 0) {
			return 0;
		}
		int N = matrix.length;
		int M = matrix[0].length;
		int[][] heights = new int[N][M];
		for (int i=0; i<N; i++) {
			for (int j=0; j<M; j++) {
				if (i == 0) {	
					heights[i][j] = matrix[i][j] - '0';
				} else {
					if (matrix[i][j] == '1') {
						heights[i][j] = heights[i-1][j] + matrix[i][j] - '0';
					} else {
						heights[i][j] = matrix[i][j] - '0';
					}
				}
			}
		}
		
		// process
		Deque<Integer> stack = new ArrayDeque<Integer>();
		int maxRec = 0;
		for (int i=0; i<N; i++) {
			stack.clear();
			for (int j=0; j<M; j++) {
				if (stack.isEmpty() || 
						(!stack.isEmpty() && heights[i][stack.peekLast()] <= heights[i][j])) {
					stack.addLast(j);
				} else {
					while (!stack.isEmpty() && heights[i][stack.peekLast()] > heights[i][j]) {
						int index = stack.pollLast();
						if (stack.isEmpty()) {
							maxRec = Math.max(heights[i][index] * j , maxRec);
						} else {
							maxRec = Math.max(heights[i][index] * (j - stack.peekLast() - 1) , maxRec);
						}
					}
					stack.addLast(j);
				}
			}
			while (!stack.isEmpty() && heights[i][stack.peekLast()] > 0) {
				int index = stack.pollLast();
				if (stack.isEmpty()) {
					maxRec = Math.max(heights[i][index] * M , maxRec);
				} else {
					maxRec = Math.max(heights[i][index] * (M - stack.peekLast() - 1) , maxRec);
				}
			}
		}
	
		return maxRec;
    }
}
package rookie.java.leetcode.lt54;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public List<Integer> spiralOrder(int[][] matrix) {
		List<Integer> output = new ArrayList<Integer>();
		
		spiralOrder(matrix, 0, output);
		return output;
    }
	
	private void spiralOrder(int[][] matrix, int index, List<Integer> output) {
		if (index < Math.min(Math.ceil(matrix.length / 2.0), 
				Math.ceil(matrix[0].length / 2.0))) {
			for (int i=index; i<matrix[0].length-index; i++) {
				output.add(matrix[index][i]);
			}
			for (int i=1+index; i<matrix.length-1-index; i++) {
				output.add(matrix[i][matrix[0].length-1-index]);
			}
			if (index < matrix.length - 1 - index) {
				for (int i=matrix[0].length-index-1; i>=index; i--) {
					output.add(matrix[matrix.length-1-index][i]);
				}
			}
			if (index < matrix[0].length - 1 -index) {
				for (int i=matrix.length-2-index; i>=1+index; i--) {
					output.add(matrix[i][index]);
				}
			}
			spiralOrder(matrix, index+1, output);
		}
	}
}

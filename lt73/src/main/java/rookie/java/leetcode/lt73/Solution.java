package rookie.java.leetcode.lt73;

public class Solution {
	public void setZeroes(int[][] matrix) {
		// initialize
		boolean[] rows = new boolean[matrix.length];
		boolean[] cols = new boolean[matrix[0].length];
		
		// record
		for (int i=0; i<matrix.length; i++) {
			for (int j=0; j<matrix[0].length; j++) {
				if (matrix[i][j] == 0) {
					rows[i] = true;
					cols[j] = true;
				}
			}
		}
		
		// set zeros
		for (int i=0; i<matrix.length; i++) {
			if (rows[i]) {
				setRowZeros(matrix, i);
			}
		}
		
		for (int j=0; j<matrix[0].length; j++) {
			if (cols[j]) {
				setColZeros(matrix, j);
			}
		}
    }
	
	private void setRowZeros(int[][] matrix, int row) {
		for (int j=0; j<matrix[row].length; j++) {
			matrix[row][j] = 0;
		}
	}
	
	private void setColZeros(int[][] matrix, int col) {
		for (int i=0; i<matrix.length; i++) {
			matrix[i][col] = 0;
		}
	}
}

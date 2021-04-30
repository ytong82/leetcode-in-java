package rookie.java.leetcode.lt59;

public class Solution {
	 public int[][] generateMatrix(int n) {
		 int[][] matrix = new int[n][n];
		 spiralOrder(matrix, 0, 1, n);
		 return matrix;
	 }
	 
	 private void spiralOrder(int[][] matrix, int index, int num, int n) {
			if (num <= n * n ) {
				for (int i=index; i<matrix[0].length-index; i++) {
					matrix[index][i] = num++;
				}
				for (int i=1+index; i<matrix.length-1-index; i++) {
					matrix[i][matrix[0].length-1-index] = num++;
				}
				if (index < matrix.length - 1 - index) {
					for (int i=matrix[0].length-index-1; i>=index; i--) {
						matrix[matrix.length-1-index][i] = num++;
					}
				}
				if (index < matrix[0].length - 1 -index) {
					for (int i=matrix.length-2-index; i>=1+index; i--) {
						matrix[i][index] = num++;
					}
				}
				spiralOrder(matrix, index+1, num, n);
			}
		}
}

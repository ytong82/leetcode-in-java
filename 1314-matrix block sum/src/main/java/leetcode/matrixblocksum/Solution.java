package leetcode.matrixblocksum;

public class Solution {
	public int[][] matrixBlockSum(int[][] mat, int k) {
		if (mat.length == 0) {
			return null;
		}
		
		int length = mat.length;
		int width = mat[0].length;
		int[][] tempMatrix = new int[length][width];
		
		for (int j=0; j<width; ++j) {
			for (int i=0; i<length; ++i) {
				if (i == 0) {
					for (int z=0; z<=k; ++z) {
						tempMatrix[i][j] += mat[z][j];
					}
				} 
			}
		}
		return null;
	}
}
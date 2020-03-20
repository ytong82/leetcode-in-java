package leetcode.matrixblocksum;

public class Solution {
	public int[][] matrixBlockSum(int[][] mat, int k) {
		if (mat.length == 0) {
			return null;
		}
		
		int length = mat.length;
		int width = mat[0].length;

		int left = 0;
		int right = 0;

		int[][] tempMatrix = new int[length][width];
		
		// use sliding window to calculate column based row sum
		for (int j=0; j<width; ++j) {		
			for (int i=0; i<length; ++i) {
				if (i == 0) {
					for (int z=0; z<=k && z<length; ++z) {
						tempMatrix[i][j] += mat[z][j];
					}
					left = i - k;
					right = i + k;
				} else {
					left++;
					right++;
					tempMatrix[i][j] = tempMatrix[i-1][j];
					if (left > 0) {
						tempMatrix[i][j] -= mat[left-1][j]; 
					}
					if (right < length) {
						tempMatrix[i][j] += mat[right][j];
					}
				}
			}
		}
		
		int[][] resMatrix = new int[length][width];
		
		// use sliding window to calculate row based sum
		// return res matrix
		for (int i=0; i<length; ++i) {
			for (int j=0; j<width; ++j) {
				if (j == 0) {
					for (int z=0; z<=k && z<width; ++z) {
						resMatrix[i][j] += tempMatrix[i][z];
					}
					left = j - k;
					right = j + k;
				} else {
					left++;
					right++;
					resMatrix[i][j] = resMatrix[i][j-1];
					if (left > 0) {
						resMatrix[i][j] -= tempMatrix[i][left-1];
					}
					if (right < width) {
						resMatrix[i][j] += tempMatrix[i][right];
					}
				}
			}
		}
		return resMatrix;
	}
}
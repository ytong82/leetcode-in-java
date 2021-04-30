package rookie.java.leetcode.lt74;

public class Solution {
	public boolean searchMatrix(int[][] matrix, int target) {
		if (matrix.length == 0 || matrix[0].length == 0) {
			return false;
		}
		// search column 0
		int left = 0, right = matrix.length - 1;
		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (matrix[mid][0] > target) {
				right = mid - 1;
			} else if (matrix[mid][0] < target) {
				left = mid + 1;
			} else {
				return true;
			}
		}
	
		// search specific row
		if (right < 0) {
			return false;
		}
		
		int	row = right;		
		left = 0; right = matrix[0].length - 1;
		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (matrix[row][mid] > target) {
				right = mid - 1;
			} else if (matrix[row][mid] < target) {
				left = mid + 1;
			} else {
				return true;
			}
		}

        return false;
    }
}

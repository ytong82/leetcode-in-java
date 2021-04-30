package rookie.java.leetcode.lt52;

public class Solution {
	private int count = 0;
	
	public int totalNQueens(int n) {
		// initialize state
		String[][] state = new String[n][n];
		for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++) {
				state[i][j] = ".";
			}
		}
		solveNQueens(0, n, state);
		return this.count;
	}
	
	private void solveNQueens(int i, int n, String[][] state) {
		if (i == n-1) {
			for (int j=0; j<n; j++) {
				state[i][j] = "Q";
				if (validate(i, j, state)) {
					this.count++;
				}
				state[i][j] = ".";
			}
		} else {
			for (int j=0; j<n; j++) {
				state[i][j] = "Q";
				if (validate(i, j, state)) {
					solveNQueens(i+1, n, state);
				}
				state[i][j] = ".";
			}
		}
	}
	
	private boolean validate(int row, int column, String[][] state) {
		// check column
		int n = state.length;
		for (int i=0; i<row; i++) {
			if (state[i][column] == "Q") {
				return false;
			}
		}
		
		// check main diagonal
		for (int i=0,j=column-row; i<row; i++,j++) {
			if (j>=0 && state[i][j] == "Q") {
				return false;
			}
		}
		
		// check sub diagonal
		for (int i=0,j=column+row; i<row; i++,j--) {
			if (j<n && state[i][j] == "Q") {
				return false;
			}
		}
		
		return true;
	}
}

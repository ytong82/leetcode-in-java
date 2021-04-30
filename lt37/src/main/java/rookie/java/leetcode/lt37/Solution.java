package rookie.java.leetcode.lt37;

public class Solution {
    public void solveSudoku(char[][] board) {
    	solveSudoku(board, 0, 0);
    }
    
    private boolean solveSudoku(char[][] board, int i, int j) {
    	if (i == board.length) {
    		return true;
    	}
    	if (j == board[0].length) {
    		return solveSudoku(board, i+1, 0);
    	}
    	if (board[i][j] != '.') {
    		return solveSudoku(board, i, j+1);
    	}
    	for (int x=1; x<=9; x++) {
    		if (isValid(board, i, j, Character.forDigit(x, 10))) {
    			board[i][j] = Character.forDigit(x, 10);
    			if (solveSudoku(board, i, j+1)) {
    				return true;
    			}
    			board[i][j] = '.';
    		} 
    	}
    	return false;
    }
    
    private boolean isValid(char[][] board, int i, int j, char val) {
    	for (int x=0; x<9; x++) {
    		if (board[x][j] == val) {
    			return false;
    		}
    	}
    	
    	for (int y=0; y<9; y++) {
    		if (board[i][y] == val) {
    			return false;
    		}
    	}
    	
    	int row = i - i % 3;
    	int col = j - j % 3;
    	for (int x=0; x<3; x++) {
    		for (int y=0; y<3; y++) {
    			if (board[x+row][y+col] == val) {
    				return false;
    			}
    		}
    	}
    	
    	return true;
    }
}
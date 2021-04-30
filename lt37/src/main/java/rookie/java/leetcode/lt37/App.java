package rookie.java.leetcode.lt37;

import java.util.Arrays;

public class App {
    public static void main( String[] args ) {
        Solution solution = new Solution();
        char[][] board = {
        		{'5','3','.','.','7','.','.','.','.'},
        		{'6','.','.','1','9','5','.','.','.'},
        		{'.','9','8','.','.','.','.','6','.'},
        		{'8','.','.','.','6','.','.','.','3'},
        		{'4','.','.','8','.','3','.','.','1'},
        		{'7','.','.','.','2','.','.','.','6'},
        		{'.','6','.','.','.','.','2','8','.'},
        		{'.','.','.','4','1','9','.','.','5'},
        		{'.','.','.','.','.','.','.','7','9'},
        };
        solution.solveSudoku(board);
        for (char[] row : board) {
        	System.out.println(Arrays.toString(row));
        }
    }
}

package rookie.java.leetcode.lt73;

import java.util.Arrays;

public class App {
    public static void main( String[] args ) {
    	Solution solution = new Solution();
    	int[][] matrix = {{1,1,1}, {1,0,1}, {1,1,1}};
    	solution.setZeroes(matrix);
    	for (int[] row : matrix) {
    		System.out.println(Arrays.toString(row));
    	}
    }
}

package rookie.java.leetcode.lt59;

import java.util.Arrays;

public class App {
    public static void main( String[] args ) {
        Solution solution = new Solution();
        int[][] matrix = solution.generateMatrix(20);
        for (int[] row : matrix) {
        	System.out.println(Arrays.toString(row));
        }  
    }
}

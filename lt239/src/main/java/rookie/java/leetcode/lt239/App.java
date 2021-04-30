package rookie.java.leetcode.lt239;

import java.util.Arrays;

import rookie.java.leetcode.lt239.queue.Solution;

public class App {
    public static void main( String[] args ) {
        Solution solution = new Solution();
    	int[][] numses = {{1,3,-1,-3,5,3,6,7},{1},{1,-1},{9,11},{4,-2}};
        int[] ks = {3,1,1,2,2};
        for (int i=0; i<numses.length; i++) {
        	System.out.println(Arrays.toString(solution.maxSlidingWindow(numses[i], ks[i])));
        }
    }
}

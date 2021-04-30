package rookie.java.leetcode.lt84;

import rookie.java.leetcode.lt84.stack.Solution;

public class App {
    public static void main( String[] args ) {
    	Solution solution = new Solution();
    	int[][] heightses = {{2,1,5,6,2,3}, {4,2,0,3,2,5}, {1}, {0,9}, {3,6,5,7,4,8,1,0}};
    	for (int i=0; i<heightses.length; i++) {
    		System.out.println(solution.largestRectangleArea(heightses[i]));
    	}
    }
}

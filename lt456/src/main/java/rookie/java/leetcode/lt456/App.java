package rookie.java.leetcode.lt456;

import rookie.java.leetcode.lt456.on2.Solution;

public class App {
    public static void main( String[] args ) {
        Solution solution = new Solution();
        int[][] numses = {{1,2,3,4}, {3,1,4,2}, {-1,3,2,0},{3,5,0,3,4},{1,0,1,-4,-3}};
        
        for (int[] nums : numses) {
        	System.out.println(solution.find132pattern(nums));
        }
    }
}

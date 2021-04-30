package rookie.java.leetcode.lt53;

import rookie.java.leetcode.lt53.divider.Solution;

public class App {
    public static void main( String[] args ) {
    	Solution solution = new Solution();
    	int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(solution.maxSubArray(nums));
    }
}

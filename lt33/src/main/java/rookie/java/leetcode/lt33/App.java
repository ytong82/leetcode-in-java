package rookie.java.leetcode.lt33;

import rookie.java.leetcode.lt33.recursive.Solution;

public class App {
    public static void main( String[] args ) {
        Solution solution = new Solution();
        //int[] nums = {4,5,6,7,0,1,2};
        //System.out.println(solution.search(nums, 0));
        //System.out.println(solution.search(nums, 3));
        int[] nums = {3,1};
        System.out.println(solution.search(nums, 1));
    }
}

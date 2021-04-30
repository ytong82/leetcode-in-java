package rookie.java.leetcode.lt46;

import java.util.List;

public class App {
    public static void main( String[] args ) {
    	Solution solution = new Solution();
        //int[] nums = {1,2,3};
        //int[] nums = {0,1};
    	int[] nums = {1};
    	List<List<Integer>> reses = solution.permute(nums);
        System.out.println(reses);
    }
}

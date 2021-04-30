package rookie.java.leetcode.lt90;

import java.util.List;

public class App {
    public static void main( String[] args ) {
        Solution solution = new Solution();
        //int[] nums = {1, 2, 2};
        int[] nums = {4, 4, 4, 1, 4};
        List<List<Integer>> reses = solution.subsetsWithDup(nums);
        for (List<Integer> res : reses) {
        	System.out.println(res);
        }
    }
}

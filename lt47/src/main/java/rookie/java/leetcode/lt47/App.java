package rookie.java.leetcode.lt47;

import java.util.List;

public class App {
    public static void main(String[] args) {
        Solution soluion = new Solution();
        //int[] nums = {1, 1, 2};
        //int[] nums = {1, 2, 3};
        int[] nums = {1};
        
        List<List<Integer>> res = soluion.permuteUnique(nums);
        for (List<Integer> list : res) {
        	System.out.println(list);
        }
    }
}

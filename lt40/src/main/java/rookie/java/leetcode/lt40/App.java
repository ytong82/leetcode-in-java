package rookie.java.leetcode.lt40;

import java.util.List;

public class App {
    public static void main( String[] args ) {
    	Solution solution = new Solution();
    	//int[] candidates = {10,1,2,7,6,1,5};
    	//int target = 8;
    	int[] candidates = {2,5,2,1,2};
    	int target = 5;
    	List<List<Integer>> reses = solution.combinationSum2(candidates, target);
    	for (List<Integer> res : reses) {
    		System.out.println(res);
    	}
    }
}

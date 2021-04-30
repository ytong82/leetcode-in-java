package rookie.java.leetcode.lt39;

import java.util.List;

public class App {
    public static void main( String[] args ) {
        Solution solution = new Solution();
        int[] candidates = {1};
        int target = 2;
        
        List<List<Integer>> reses = solution.combinationSum(candidates, target);
        System.out.print("[");
        for (List<Integer> res : reses) {
        	System.out.print("[");
        	for (Integer item : res) {
        		System.out.printf("%s,", item);
        	}
        	System.out.print("],");
        }
        System.out.println("]");
    }
}

package rookie.java.leetcode.lt77;

import java.util.List;

public class App {
    public static void main( String[] args ) {
        Solution solution = new Solution();
        List<List<Integer>> combinations = solution.combine(4,2);
        System.out.println(combinations.size());
        for (List<Integer> combination : combinations) {
        	System.out.print(combination);
        }
    }
}

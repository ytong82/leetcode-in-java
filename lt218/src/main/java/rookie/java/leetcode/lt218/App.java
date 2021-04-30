package rookie.java.leetcode.lt218;

import java.util.List;

public class App {
    public static void main( String[] args ) {
        Solution solution = new Solution();
        int[][] buildings = {{2,9,10}, {3,7,15}, {5,12,12}, {15,20,10}, {19,24,8}};
        List<List<Integer>> points = solution.getSkyline(buildings);
        System.out.print("[");
        for (List<Integer> point : points) {
        	System.out.printf("%s, ", point);
        }
        System.out.println("]");
    }
}

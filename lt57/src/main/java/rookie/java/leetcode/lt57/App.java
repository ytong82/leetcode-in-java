package rookie.java.leetcode.lt57;

import java.util.Arrays;

public class App {
    public static void main( String[] args ) {
        int[][][] intervalses = {{{1,3}, {6,9}}, {{1,2}, {3,5}, {6,7}, {8,10}, {12,16}},
        		{},{{1,5}},{{1,5}}, {{2,6}, {7,9}}};
        int[][] newIntervals = {{2,5}, {4,8}, {5,7}, {2,3}, {2,7}, {15,18}};
        Solution solution = new Solution();
        for (int i=0; i<intervalses.length; i++) {
        	int[][] res = solution.insert(intervalses[i], newIntervals[i]);
        	System.out.print("[");
        	for (int[] range : res) {
        		System.out.print(Arrays.toString(range));
        	}
        	System.out.println("]");
        }
    }
}
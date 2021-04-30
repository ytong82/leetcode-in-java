package rookie.java.leetcode.lt1539;

public class App {
    public static void main( String[] args ) {
        Solution solution = new Solution();
        int[][] arrs = {{2,3,4,7,11}, {1,2,3,4}, {1}};
        int[] ks = {5,2, 1000};
        for (int i=0; i<arrs.length; i++) {
        	System.out.println(solution.findKthPositive(arrs[i], ks[i]));
        }
    }
}

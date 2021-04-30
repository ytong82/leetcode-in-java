package rookie.java.leetcode.lt910;

public class App {
    public static void main( String[] args ) {
        Solution solution = new Solution();
    	int[][] As = {{1}, {0,10}, {1,3,6}};
        int[] Ks = {0,2,3};
        for (int i=0; i<As.length; i++) {
        	System.out.println(solution.smallestRangeII(As[i], Ks[i]));
        }
    }
}

package rookie.java.leetcode.lt18;

public class App {
    public static void main( String[] args ) {
        Solution solution = new Solution();
        int[][] numses = {{1,0,-1,0,-2,2},{-2,-1,-1,1,1,2,2}};
        int[] targets = {0,0};
        for (int i=0; i<numses.length; i++) {
        	System.out.println(solution.fourSum(numses[i], targets[i]));
        }
    }
}

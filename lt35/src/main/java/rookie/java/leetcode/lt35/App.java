package rookie.java.leetcode.lt35;

public class App {
    public static void main( String[] args ) {
        Solution solution = new Solution();
        int[][] numses = {{1,3,5,6},{1,3,5,6},{1,3,5,6},{1,3,5,6},{1},{1,3}};
        int[] targets = {5,2,7,0,0,2};
        for (int i=0; i<numses.length; i++) {
        	//if (i == numses.length - 1)
        		System.out.println(solution.searchInsert(numses[i], targets[i]));
        }
    }
}

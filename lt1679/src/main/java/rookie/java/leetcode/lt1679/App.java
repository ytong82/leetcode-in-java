package rookie.java.leetcode.lt1679;

public class App {
    public static void main( String[] args ) {
        Solution solution = new Solution();
    	int[][] numses = {{1,2,3,4}, {3,1,3,4,3}};
    	int[] ks = {5,6};
        for (int i=0; i<numses.length; i++) {
        	if (i == 1)
        		System.out.println(solution.maxOperations(numses[i], ks[i]));
        }
    }
}

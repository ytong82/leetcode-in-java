package rookie.java.leetcode.lt31;

public class App {
    public static void main( String[] args ) {
        Solution solution = new Solution();
        int[][] numses = {{1,2,7,4,3,1},{3,2,1},{2,3,1,3,3}};
        for (int i=0; i<numses.length; i++) {
        	//if (i == 2) {
        		solution.nextPermutation(numses[i]);
        	//}
        }
    }
}
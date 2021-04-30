package rookie.java.leetcode.lt220;

public class App {
    public static void main( String[] args ) {
        Solution solution = new Solution();
        int[][] numses = {{1,2,3,1}, {1,0,1,1}, {1,5,9,1,5,9}, {1,3,6,2}, {-2147483648,2147483647}};
        int[] ks = {3,1,2,1,1};
        int[] ts = {0,2,3,2,1};
        for (int i=0; i<numses.length; i++) {
        	System.out.println(solution.containsNearbyAlmostDuplicate(numses[i], ks[i], ts[i]));
        }
    }
}

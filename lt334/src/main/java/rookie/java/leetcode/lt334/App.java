package rookie.java.leetcode.lt334;

public class App {
    public static void main( String[] args ) {
        Solution solution = new Solution();
        int[][] numses = {{1,2,3,4,5}, {5,4,3,2,1}, {2,1,5,0,4,6}};
        for (int[] nums : numses) {
        	System.out.println(solution.increasingTriplet(nums));
        }
    }
}

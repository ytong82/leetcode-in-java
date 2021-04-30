package rookie.java.leetcode.lt941;

public class App {
    public static void main( String[] args ) {
        Solution solution = new Solution();
        int[][] arrs = {{2,1}, {3,5,5}, {0,3,2,1},{1,2,3},{9,8,7,6,5,4,3,2,1,0}};
        for (int[] arr : arrs) {
        	System.out.println(solution.validMountainArray(arr));
        }
    }
}

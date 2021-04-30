package rookie.java.leetcode.lt64;

public class App {
    public static void main( String[] args ) {
        Solution solution = new Solution();
    	//int[][] grid = {{1,3,1},{1,5,1},{4,2,1}};
        int[][] grid = {{1,2,3},{4,5,6}};
        System.out.println(solution.minPathSum(grid));
    }
}

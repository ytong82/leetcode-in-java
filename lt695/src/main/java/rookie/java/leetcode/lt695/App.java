package rookie.java.leetcode.lt695;

public class App {
    public static void main( String[] args ) {
        Solution solution = new Solution();
        /*int[][] grid = {
        		{0,0,1,0,0,0,0,1,0,0,0,0,0},
        		{0,0,0,0,0,0,0,1,1,1,0,0,0},
        		{0,1,1,0,1,0,0,0,0,0,0,0,0},
        		{0,1,0,0,1,1,0,0,1,0,1,0,0},
        		{0,1,0,0,1,1,0,0,1,1,1,0,0},
        		{0,0,0,0,0,0,0,0,0,0,1,0,0},
        		{0,0,0,0,0,0,0,1,1,1,0,0,0},
        		{0,0,0,0,0,0,0,1,1,0,0,0,0}
        		};*/
        int[][] grid = {{0,0,0,0,0,0,0,0}};
        System.out.println(solution.maxAreaOfIsland(grid));
    }
}

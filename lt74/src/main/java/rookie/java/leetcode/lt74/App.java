package rookie.java.leetcode.lt74;

public class App {
    public static void main( String[] args ) {
        Solution solution = new Solution();
        //int[][] matrix = {{1,3,5,7}, {10,11,16,20}, {23,30,34,50}};
        int[][] matrix = {{1}};
        int target = 0;
        System.out.println(solution.searchMatrix(matrix, target));
    }
}

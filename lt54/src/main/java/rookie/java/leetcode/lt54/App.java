package rookie.java.leetcode.lt54;

public class App {
    public static void main( String[] args ) {
    	Solution solution = new Solution();
    	int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
    	//int[][] matrix = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}};
    	//int[][] matrix = {{3},{2}};
    	//int[][] matrix = {{7},{9},{6}};
    	System.out.println(solution.spiralOrder(matrix));
    }
}

package rookie.java.leetcode.lt85;

public class App {
    public static void main( String[] args ) {
        Solution solution = new Solution();
        char[][] matrix = {
        		{'1', '0', '1', '0', '0'}, 
        		{'1', '0', '1', '1', '1'}, 
        		{'1', '1', '1', '1', '1'},
        		{'1', '0', '0', '1', '0'},
        		};
        //char[][] matrix = {{'0', '1'}, {'1', '0'}};
        /*char[][] matrix = {
        		{'0', '1', '1', '0', '1'}, 
        		{'1', '1', '0', '1', '0'}, 
        		{'0', '1', '1', '1', '0'},
        		{'1', '1', '1', '1', '0'},
        		{'1', '1', '1', '1', '1'},
        		{'0', '0', '0', '0', '0'}
        		};*/
        /*char[][] matrix = {
        		{'1', '0', '0', '0', '1'},
        		{'1', '1', '0', '1', '1'},
        		{'1', '1', '1', '1', '1'},
        		};*/
        System.out.println(solution.maximalRectangle(matrix));
    }
}

package rookie.java.leetcode.lt188;

public class App {
    public static void main( String[] args ) {
        int[] prices = {2, 4, 1};
        //int[] prices = {3, 2, 6, 5, 0, 3};
        //int[] prices = {1, 2, 4};
    	int k = 2;
        
        Solution solution = new Solution();
        System.out.println(solution.maxProfit(k, prices));
    }
}

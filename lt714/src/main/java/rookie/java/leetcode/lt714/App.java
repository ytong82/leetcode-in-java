package rookie.java.leetcode.lt714;

public class App {
    public static void main( String[] args ) {
        Solution solution = new Solution();
        int[] prices = {1,3,2,8,4,9};
        int fee = 2;
        System.out.println(solution.maxProfit(prices, fee));
    }
}

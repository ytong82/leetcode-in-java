package rookie.java.leetcode.lt121;

import rookie.java.leetcode.lt121.dp.Solution;

public class App 
{
    public static void main( String[] args )
    {
        Solution solution = new Solution();
    	int[] prices = {7,1,5,3,6,4};
    	//int[] prices = {7,6,4,3,1};
        
        System.out.println(solution.maxProfit(prices));
    }
}

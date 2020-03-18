package leetcode.coinchange;

public class App 
{
    public static void main( String[] args )
    {
        //int[] coins = {1, 2, 5};
        //int amount = 11;
        
    	int[] coins = {2};
    	int amount = 3;
    	
        Solution solution = new Solution();
        System.out.println(solution.coinChange(coins, amount));
    }
}

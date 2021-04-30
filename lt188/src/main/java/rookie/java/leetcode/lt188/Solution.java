package rookie.java.leetcode.lt188;

public class Solution {
	public int maxProfit(int k, int[] prices) {
        if (prices == null) {
        	return 0;
        }
        
        if (k > prices.length) {
        	return maxProfitUnlimited(prices);
        }
        
        // in day i, finish k transaction, kept or sold stock
        int[][] kept = new int[prices.length+1][k+1];
        int[][] sold = new int[prices.length+1][k+1];
        
        // initialize day 0, for initial value
        for (int j=0; j<=k; j++) {
        	kept[0][j] = Integer.MIN_VALUE;
        	sold[0][j] = 0;
        }
        for (int i=1; i<=prices.length; i++) {
        	kept[i][0] = Integer.MIN_VALUE;
        	sold[i][0] = 0;
        }
   
        // dp transfer formula
        for (int i=1; i<=prices.length; i++) {
        	for (int j=1; j<=k; j++) {
        		kept[i][j] = Math.max(kept[i-1][j], sold[i-1][j-1] - prices[i-1]);
        		sold[i][j] = Math.max(sold[i-1][j], kept[i-1][j] + prices[i-1]);
        	}
        	printDP(kept, sold);
        }
        
        return sold[prices.length][k];
    }
	
	private int maxProfitUnlimited(int[] prices) {
		int sum = 0;
    	for (int i=1; i<prices.length; i++) {
    		if (prices[i] > prices[i-1]) {
    			sum += prices[i] - prices[i-1];
    		}
    	}
    	return sum;
	}
	
	private void printDP(int[][] kept, int[][] sold) {
		System.out.println("KEPT THE STOCK");
		for (int i=0; i<kept.length; i++) {
			for (int j=0; j<kept[0].length; j++) {
				System.out.printf("[%s, %s] = %s, ", i, j, kept[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("SOLD THE STOCK");
		for (int i=0; i<sold.length; i++) {
			for (int j=0; j<sold[0].length; j++) {
				System.out.printf("[%s, %s] = %s, ", i, j, sold[i][j]);
			}
			System.out.println();
		}
		
		System.out.println();
	}
}

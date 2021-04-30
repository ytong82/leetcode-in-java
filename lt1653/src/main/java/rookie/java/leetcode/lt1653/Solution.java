package rookie.java.leetcode.lt1653;

public class Solution {
	public int minimumDeletions(String s) {
		if (s.isEmpty()) 
			return 0;
		
        int[][] dp = new int[s.length()][2];
        
        // count b numbers before it, from left to right
        for (int i=0; i<s.length(); i++) {
        	if (s.charAt(i) == 'b') {
        		if (i == 0) {
        			dp[i][0] = 1;
        		} else {
        			dp[i][0] = dp[i-1][0] + 1;
        		}
        	} else {
        		if (i == 0) {
        			dp[i][0] = 0;
        		} else {
        			dp[i][0] = dp[i-1][0];
        		}
        	}
        }
        
        // count a numbers after it, from right to left
        for (int i=s.length()-1; i>=0; i--) {
        	if (s.charAt(i) == 'a') {
        		if (i == s.length() - 1) {
        			dp[i][1] = 1;
         		} else {
         			dp[i][1] = dp[i+1][1] + 1; 
         		}
        	} else {
        		if (i == s.length() - 1) {
        			dp[i][1] = 0;
        		} else {
        			dp[i][1] = dp[i+1][1];
        		}
        	}
        }
        
        // get minimal value
        if (dp[s.length()-1][0] == 0) {
        	return 0;
        } else if (dp[0][1] == 0) {
        	return 0;
        }
        int res = Integer.MAX_VALUE;
        for (int i=0; i<s.length(); i++) {
        	int t = 0;
        	if (dp[i][0] != 0 && dp[i][1] != 0) {
        		t = 1;
        	}
        	res = Math.min(res, dp[i][0] + dp[i][1] - t);
        	
        }       
		return res;
    }

}

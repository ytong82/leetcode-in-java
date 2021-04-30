package rookie.java.leetcode.lt32;

class Solution {
    public int longestValidParentheses(String s) {
    	if (s.length() < 2) 
    		return 0;
    	
        int[] dp = new int[s.length()];
        dp[0] = 0;
        for (int i=1; i<s.length(); i++) {
        	if (s.charAt(i) == '(') {
        		dp[i] = 0;
        	} else if (s.charAt(i) == ')') {
        		if (s.charAt(i-1) == '(') {
        			if (i >= 2) {
        				dp[i] = dp[i-2] + 2;
        			} else {
        				dp[i] = 2;
        			}
        		} else if (s.charAt(i) == ')') {
        			if (i-dp[i-1] > 0) {
	        			if (s.charAt(i-dp[i-1]-1) == '(') {
	        				if (i-dp[i-1]-2>=0) {
	        					dp[i] = dp[i-dp[i-1]-2] + dp[i-1] + 2;  
	        				} else {
	        					dp[i] = dp[i-1] + 2;  
	        				}
	        			} else {
	        				dp[i] = 0;
	        			}
        			} else {
        				dp[i] = 0;
        			}
        		}
        	}
        }
    	
        int longest = 0;
        for (int i=0; i<s.length(); i++) {
        	if (longest < dp[i]) {
        		longest = dp[i];
        	}
        }
        
    	return longest;
    }
}

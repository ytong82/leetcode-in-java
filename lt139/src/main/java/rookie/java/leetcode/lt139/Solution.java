package rookie.java.leetcode.lt139;

import java.util.List;

public class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
    	boolean[] dp = new boolean[s.length() + 1];
    	for (int i=0; i<=s.length(); i++) {
    		dp[i] = false;
    	}
    	dp[0] = true;
    	
    	for (int i=1; i<=s.length(); i++) {
    		for (int j=0; j<=i; j++) {
    			if (dp[j] && wordDict.contains(s.substring(j, i))) {
    				dp[i] = true;
    			}
    		}
    	}
        return dp[s.length()];
    }
}

package rookie.java.leetcode.lt43;

class Solution {
    public String multiply(String num1, String num2) {
        int[] dp = new int[num1.length() + num2.length()];
        
        for (int i=num2.length()-1, start=0; i>=0; i--, start++) {
        	int item = Integer.parseInt(num2.substring(i, i+1));
        	for (int j=num1.length()-1, start2=0; j>=0; j--, start2++) {
        		int item2 = Integer.parseInt(num1.substring(j, j+1));
        		int product = item * item2;
        		if (product >= 10) {
        			dp[start+start2+1] += product / 10;
        			dp[start+start2] += product % 10;
        		} else {
        			dp[start+start2] += product % 10;
        		}
        	}
        }
        
        for (int i=0; i<=num1.length()+num2.length()-1; i++) {
        	if (dp[i] >= 10) {
    			dp[i+1] += dp[i] / 10;
    			dp[i] = dp[i] % 10;
    		} else {
    			dp[i] = dp[i] % 10;
    		}
        }
        
        int end = num1.length()+num2.length()-1;
        while (end >= 0 && dp[end] == 0) {
        	end--;
        }
        
        if (end == -1) {
        	return "0";
        }
        
        String res = "";
        for (int i=end; i>=0; i--) {
        	res = res.concat(Integer.toString(dp[i]));
        }      
    	return res;
    }
}
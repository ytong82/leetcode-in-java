package rookie.java.leetcode.lt09;

public class Solution {
    public boolean isPalindrome(int x) {
    	String number = Integer.toString(x);
    	
    	int start = 0;
    	int start2 = 0;
    	int mid = number.length() / 2;
    	if (number.length() % 2 == 1) {
    		start = mid - 1;
    		start2 = mid + 1;
    	} else {
    		start = mid - 1;
    		start2 = mid;
    	}
    	
    	for (int i=0; i<=start; i++) {
    		if (number.charAt(start - i) != number.charAt(start2 + i)) {
    			return false;
    		}
    	}
        return true;
    }
}

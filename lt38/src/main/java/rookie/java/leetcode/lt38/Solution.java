package rookie.java.leetcode.lt38;

public class Solution {
	public String countAndSay(int n) {
		if (n <= 0) {
			return "";
		}
		
        if (n == 1) {
        	return "1";
        } else {
        	String tmp = countAndSay(n-1);
        	String res = "";
        	
        	int left = 0;
        	int right = 0;
        	for (; right<tmp.length(); right++) {
        		if (tmp.charAt(left) != tmp.charAt(right)) {
        			res += String.valueOf(right-left) + tmp.charAt(left);
        			left = right;
        		}
        	}
        	res += String.valueOf(right-left) + tmp.charAt(left);
        	return res;
        }
    }
}

package rookie.java.leetcode.lt1328;

public class Solution {
	public String breakPalindrome(String palindrome) {
		int N = palindrome.length();
		if (N == 1) {
			return "";
		}
		
		for (int i=0; i<N; i++) {
			if (!palindrome.substring(i, i+1).equals("a")) {
				if (N % 2 != 0 && i == N / 2) {
					
				} else {
					return palindrome.substring(0, i) + "a" + palindrome.substring(i+1);
				}
			}
		}
		
		return palindrome.substring(0, N-1) + "b";
    }
}

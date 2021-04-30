package rookie.java.leetcode.lt880;

public class Solution {
	public String decodeAtIndex(String S, int K) {
		long length = 0;
		for (int i=0; i<S.length(); i++) {
			if (Character.isDigit(S.charAt(i))) {
				length = length * (S.charAt(i) - '0');
			} else {
				length++;
			}
		}
		
		for (int i=S.length() - 1; i>=0; i--) {
			char c = S.charAt(i);
			K = (int) (K % length);
			if (K == 0 && Character.isLetter(c)) {
				return Character.toString(c);
			}
			if (Character.isDigit(c)) {
				length = length / (c - '0');
			} else {
				length--;
			}
		}
		
		return "";
    }
}

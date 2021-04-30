package rookie.java.leetcode.lt65;

public class Solution {
	public boolean isNumber(String s) {
		if (s == null) {
			return false;
		}
		
		for (int i=0; i<s.length(); i++) {
			if (Character.isLetter(s.charAt(i))) {
				if (s.charAt(i) != 'e') {
					return false;
				}
			}
		}
		
		try {
			@SuppressWarnings("unused")
			double d = Double.parseDouble(s);
		} catch (NumberFormatException nfe) {
			return false;
		}
		return true;
	}
}

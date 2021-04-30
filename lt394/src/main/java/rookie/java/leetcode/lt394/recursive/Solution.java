package rookie.java.leetcode.lt394.recursive;

public class Solution {
	public String decodeString(String s) {
		String curNum = "";
		String curStr = "";
	
		for (int i=0; i<s.length(); i++) {
			if (Character.isDigit(s.charAt(i))) {
				curNum += s.charAt(i);
			} else if (s.charAt(i) == '[') {
				int counter = 0;
				String str = "";
				for (int j=i+1; j<s.length(); j++) {
					if (s.charAt(j) == '[') {
						counter++;
					} else if (s.charAt(j) == ']') {
						if (counter == 0) {
							str = decodeString(s.substring(i+1,j));
							for (int k=0; k<Integer.parseInt(curNum); k++) {
								curStr += str;
							}
							curNum = "";
							i = j;
						} else {
							counter--;
						}
					}
				}
				
			} else if (s.charAt(i) == ']') {
				
			} else {
				curStr += s.charAt(i);
			}
			
		}
		
		return curStr;
	}
}

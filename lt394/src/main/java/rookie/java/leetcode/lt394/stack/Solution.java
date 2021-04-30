package rookie.java.leetcode.lt394.stack;

import java.util.Stack;

public class Solution {
	public String decodeString(String s) {
		Stack<Integer> nums = new Stack<Integer>();
		Stack<String> strs = new Stack<String>();
		
		String curNum = "";
		String curStr = "";
		
		for (int i=0; i<s.length(); i++) {
			if (Character.isDigit(s.charAt(i))) {
				curNum += s.charAt(i);
			} else if (s.charAt(i) == '[') {
				nums.add(Integer.parseInt(curNum));
				strs.add(curStr);
				curNum = "";
				curStr = "";
			} else if (s.charAt(i) == ']') {
				int num = nums.pop();
				String str = strs.pop();
				for (int j=0; j<num; j++) {
					str += curStr;
				}
				curStr = str;
			} else {
				curStr += s.charAt(i);
			}
		}
		return curStr;
    }
}

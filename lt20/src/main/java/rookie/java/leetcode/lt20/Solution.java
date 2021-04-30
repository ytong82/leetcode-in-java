package rookie.java.leetcode.lt20;

import java.util.Stack;

public class Solution {
	public boolean isValid(String s) {
		Stack<Character> stack = new Stack<Character>();
		for (int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			switch(ch) {
			case '(':
				stack.add(ch);
				break;
			case '[':
				stack.add(ch);
				break;
			case '{':
				stack.add(ch);
				break;
			case ')':
				if (stack.size() > 0) {
					if (stack.peek() == '(') {
						stack.pop();
					} else {
						return false;
					}
				} else {
					return false;
				}
				break;
			case ']':
				if (stack.size() > 0) {
					if (stack.peek() == '[') {
						stack.pop();
					} else {
						return false;
					}
				} else {
					return false;
				}
				break;
			case '}':
				if (stack.size() > 0) {
					if (stack.peek() == '{') {
						stack.pop();
					} else {
						return false;
					}
				} else {
					return false;
				}
				break;
			default:
				return false;	
			}
		}
		if (stack.size() == 0) {
			return true;
		} else {
			return false;
		}
    }
}

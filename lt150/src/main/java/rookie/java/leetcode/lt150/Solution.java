package rookie.java.leetcode.lt150;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {
	public int evalRPN(String[] tokens) {
		Deque<Integer> stack = new ArrayDeque<Integer>();
		for (String token : tokens) {
			if (token.equals("+") || token.equals("-") ||
					token.equals("*") || token.equals("/")) {
				int num = stack.pollLast();
				int num2 = stack.pollLast();
				if (token.equals("+")) {
					stack.addLast(num2 + num);
				} else if (token.equals("-")) {
					stack.addLast(num2 - num);
				} else if (token.equals("*")) {
					stack.addLast(num2 * num);
				} else if (token.equals("/")) {
					stack.addLast(num2 / num);
				} 
			} else {
				int num = Integer.parseInt(token);
				stack.addLast(num);
			}
		}	
		return stack.pollLast();
	}
}

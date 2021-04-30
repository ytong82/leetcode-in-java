package rookie.java.leetcode.lt71;

import java.util.Stack;

public class Solution {
	public String simplifyPath(String path) {
		String[] tokens = path.split("/");
		Stack<String> stack = new Stack<String>();
		for (String token : tokens) {
			if (!token.equals("")) {
				if (token.equals("..")) {
					if (stack.size() > 0) {
						stack.pop();
					} 
				} else if (token.equals(".")){
					
				} else {
					stack.push(token);
				}
			}
		}
		
		String res = "";
		while (stack.size() > 0) {
			res = "/" + stack.pop() + res;
		}
		return res.isEmpty() ? "/" : res;
    }
}

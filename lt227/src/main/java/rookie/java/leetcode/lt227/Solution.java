package rookie.java.leetcode.lt227;

import java.util.Deque;
import java.util.LinkedList;

public class Solution {
	public int calculate(String s) {
		Deque<String> deque = new LinkedList<String>(); 
		int j = -1;
		s = s + " ";
		for (int i=0; i<s.length(); i++) {
			if (!Character.isDigit(s.charAt(i))) {
				if (j != -1) {
					if (!deque.isEmpty() && 
							(deque.peekLast().equals("*") || deque.peekLast().equals("/"))) {
						String oper = deque.pollLast();
						int val = Integer.parseInt(deque.pollLast());
						int val2 = Integer.parseInt(s.substring(j, i)); 
						if (oper.equals("*")) {
							deque.addLast(String.valueOf(val * val2));
						} else if (oper.equals("/") ) {
							deque.addLast(String.valueOf(val / val2));
						}
					} else {
						deque.add(s.substring(j, i));
					}
					j = -1;
				}
				if (s.charAt(i) == '+' || s.charAt(i) == '-' 
						|| s.charAt(i) == '*' || s.charAt(i) == '/') {
					deque.addLast(String.valueOf(s.charAt(i)));
				}
			} else {
				if (j == -1) {
					j = i;
				}
			}
		}
				
		while (deque.size() > 1) {
			int val = Integer.parseInt(deque.pollFirst());
			String oper = deque.pollFirst();
			int val2 = Integer.parseInt(deque.pollFirst());
			if (oper.equals("+")) {
				deque.addFirst(String.valueOf(val + val2));
			} else if (oper.equals("-")) {
				deque.addFirst(String.valueOf(val - val2));
			}
		}

		return Integer.parseInt(deque.getFirst());
    }
}

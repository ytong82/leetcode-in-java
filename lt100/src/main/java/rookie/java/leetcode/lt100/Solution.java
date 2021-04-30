package rookie.java.leetcode.lt100;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {
	 public boolean isSameTree(TreeNode p, TreeNode q) {
		 TreeNode curr = p;
		 TreeNode curr2 = q;
		 Deque<TreeNode> stack = new ArrayDeque<TreeNode>();
		 Deque<TreeNode> stack2 = new ArrayDeque<TreeNode>();
		 
		 if ((p != null && q == null) ||
				 (p == null && q != null)) {
			 return false;
		 }
		 
		 while ((curr != null || !stack.isEmpty()) &&
				 (curr2 != null || !stack2.isEmpty())) {
			 while (curr != null && curr2 != null) {
				 stack.addLast(curr);
				 stack2.addLast(curr2);
				 curr = curr.left;
				 curr2 = curr2.left;
			 }
			 if (curr != curr2) {
				 return false;
			 }
			 if (!stack.isEmpty() && !stack2.isEmpty()) {
				 TreeNode tmp = stack.pollLast();
				 TreeNode tmp2 = stack2.pollLast();
				 if (tmp.val != tmp2.val) {
					 return false;
				 }
				 curr = tmp.right;
				 curr2 = tmp2.right;
			 }
		 }
		 
		 if (curr != curr2) {
			 return false;
		 }
		 return true;
	 }
}

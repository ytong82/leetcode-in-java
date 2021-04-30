package rookie.java.leetcode.lt897.iterative;

import java.util.Stack;

import rookie.java.leetcode.lt897.TreeNode;

public class Solution {
	public TreeNode increasingBST(TreeNode root) {
		TreeNode curr = root;
		TreeNode prev = null;
		Stack<TreeNode> stack = new Stack<TreeNode>();
		
		boolean isHead = true;
		TreeNode head = null;
		
		while (!stack.isEmpty() || curr != null) {
			while (curr != null) {
				stack.push(curr);
				curr = curr.left;
			}	
			if (!stack.isEmpty()) {
				curr = stack.pop();
				if (isHead) {
					head = curr;
					isHead = false;
				} else {
					prev.right = curr;
					prev.left = null;
				}
				prev = curr;
				curr = curr.right;
			}
		}
		prev.left = null;
		return head;
	}
}

package rookie.java.leetcode.lt173;

import java.util.Stack;

public class BSTIterator {
	private TreeNode curr;
	private Stack<TreeNode> stack;
	
	public BSTIterator(TreeNode root) {
		this.curr = root;
        this.stack = new Stack<TreeNode>();
    }
    
    public int next() {
    	int res = 0;
    	if (!stack.isEmpty() || curr != null) {
        	while (curr != null) {
        		stack.push(curr);
        		curr = curr.left;
        	}
        	if (!stack.isEmpty()) { 
        		curr = stack.pop();
        		res = curr.val;
        		curr = curr.right;
        	}
        }
    	return res;
    }
    
    public boolean hasNext() {
        return !stack.isEmpty() || curr != null;
    }
}

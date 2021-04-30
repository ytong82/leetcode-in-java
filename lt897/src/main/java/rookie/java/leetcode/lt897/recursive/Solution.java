package rookie.java.leetcode.lt897.recursive;

import java.util.ArrayList;
import java.util.List;

import rookie.java.leetcode.lt897.TreeNode;

public class Solution {
	public TreeNode increasingBST(TreeNode root) {
		List<Integer> vals = new ArrayList<Integer>(); 
		increasingBST(root, vals);
		
		TreeNode head = null;
		TreeNode prev = null;
		for (int i=0; i<vals.size(); i++) {
			TreeNode curr = new TreeNode(vals.get(i));
			if (i == 0) {
				prev = curr;
				head = curr;
			} else {
				prev.right = curr;
				prev = curr;
			}
		}
		return head;
	}
	
	private void increasingBST(TreeNode root, List<Integer> vals) {
		if (root.left != null) {
        	increasingBST(root.left, vals);
        }
		vals.add(root.val);
        if (root.right != null) {
        	increasingBST(root.right, vals);
        }
    }
}

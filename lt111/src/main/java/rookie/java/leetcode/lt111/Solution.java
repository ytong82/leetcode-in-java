package rookie.java.leetcode.lt111;

public class Solution {
	public int minDepth(TreeNode root) {
		if (root == null) return 0;
		if (root.left == null && root.right == null) {
			return 1;
		} else if (root.left == null) {
			return this.minDepth(root.right) + 1;
		} else if (root.right == null) {
			return this.minDepth(root.left) + 1;
		} else {
			return Math.min(this.minDepth(root.left), this.minDepth(root.right)) + 1;
		}
    }
}

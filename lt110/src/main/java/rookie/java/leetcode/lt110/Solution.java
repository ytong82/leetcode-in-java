package rookie.java.leetcode.lt110;

public class Solution {
	class TreeInfo {
		int height;
		boolean balanced;
		TreeInfo(int height, boolean balanced) {
			this.height = height;
			this.balanced = balanced;
		}
	}
	
	public boolean isBalanced(TreeNode root) {
		return getTreeInfo(root).balanced;
    }
	
	private TreeInfo getTreeInfo(TreeNode root) {
		if (root != null) {
			TreeInfo left = getTreeInfo(root.left);
			TreeInfo right = getTreeInfo(root.right);	
			int height = Math.max(left.height + 1, right.height + 1);
			boolean balanced = true;
			if (Math.abs(left.height - right.height) > 1) {
				balanced = false;
			}
			balanced = balanced && left.balanced && right.balanced;
			return new TreeInfo(height, balanced);
		} else {
			return new TreeInfo(0, true);
		}
	}
}

package rookie.java.leetcode.lt337;

public class Solution {
	public int rob(TreeNode root) {
		return rob(false, root);
    }
	
	public int rob(boolean prevSel, TreeNode root) {
		if (root != null) {
			//System.out.println(root.val);
			// parent node robbed
			if (prevSel) {
				return rob(false, root.left) + rob(false, root.right);
			// parent node not robbed
			} else {
				int currRob = root.val + rob(true, root.left) + rob(true, root.right);
				int currNotRob = rob(false, root.left) + rob(false, root.right);
				return currRob > currNotRob ? currRob : currNotRob; 				
			}
		} 
		return 0;
	}
}

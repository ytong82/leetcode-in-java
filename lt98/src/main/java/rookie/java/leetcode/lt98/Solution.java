package rookie.java.leetcode.lt98;

public class Solution {
	class TreeInfo {
		boolean isValid;
		int low;
		int high;
		TreeInfo(boolean isValid, int low, int high) {
			this.isValid = isValid;
			this.low = low;
			this.high = high;
		}
	}
	
	public boolean isValidBST(TreeNode root) {
        return getBSTTreeInfo(root).isValid;
    }
	
	public TreeInfo getBSTTreeInfo(TreeNode root) {
		boolean isValid = true;
		int low = root.val;
		int high = root.val;
		
		if (root.left != null) {
			if (root.left.val < root.val) {
				TreeInfo info = getBSTTreeInfo(root.left);
				if (info.high >= root.val) {
					isValid = false;
				}
				low = Math.min(low, info.low);
				isValid = isValid && info.isValid;
			} else {
				isValid = false;
			}
		}
		
		if (root.right != null) {
			if (root.right.val > root.val) {
				TreeInfo info = getBSTTreeInfo(root.right);
				if (info.low <= root.val) {
					isValid = false;
				}
				high = Math.max(high, info.high);
				isValid = isValid && info.isValid;
			} else {
				isValid = false;
			}
		}
		
		return new TreeInfo(isValid, low, high);
    }

}

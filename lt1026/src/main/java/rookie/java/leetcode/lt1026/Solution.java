package rookie.java.leetcode.lt1026;

public class Solution {
	 class MinMax {
		int minVal;
	    int maxVal;
		int maxDiff;
		
		MinMax(int minVal, int maxVal, int maxDiff) {
			this.minVal = minVal;
			this.maxVal = maxVal;
			this.maxDiff = maxDiff;
		}
	}
	
	public int maxAncestorDiff(TreeNode root) {
		MinMax minMax = __maxAncestorDiff(root);
		return minMax.maxDiff;
	}
	
	private MinMax __maxAncestorDiff(TreeNode root) {
		if (root == null) {
			return new MinMax(-1, -1, 0);
		} else if (root.left == null && root.right == null) {
			return new MinMax(root.val, root.val, 0);
		} else {
			int minVal = Integer.MAX_VALUE;
			int maxVal = Integer.MIN_VALUE;
			int maxDiff = Integer.MIN_VALUE;
			if (root.left != null) {
				MinMax minMax = this.__maxAncestorDiff(root.left);
				if (minMax.minVal == -1) {
					minVal = Math.min(minVal, root.left.val);
				} else {
					minVal = Math.min(minVal, Math.min(root.left.val, minMax.minVal));
				}
				if (minMax.maxVal == -1) {
					maxVal = Math.max(maxVal, root.left.val);
				} else {
					maxVal = Math.max(maxVal, Math.max(root.left.val, minMax.maxVal));
				}
				maxDiff = Math.max(maxDiff, minMax.maxDiff);
			}
			if (root.right != null) {
				MinMax minMax = this.__maxAncestorDiff(root.right);
				if (minMax.minVal == -1) {
					minVal = Math.min(minVal, root.right.val);
				} else {
					minVal = Math.min(minVal, Math.min(root.right.val, minMax.minVal));
				}
				if (minMax.maxVal == -1) {
					maxVal = Math.max(maxVal, root.right.val);
				} else {
					maxVal = Math.max(maxVal, Math.max(root.right.val, minMax.maxVal));
				}
				maxDiff = Math.max(maxDiff, minMax.maxDiff);
			}
			
			if (minVal != Integer.MAX_VALUE) {
				maxDiff = Math.max(maxDiff, Math.max(Math.abs(root.val - maxVal), Math.abs(root.val - minVal)));
			}
			return new MinMax(minVal, maxVal, maxDiff);
		}
	}
}
package rookie.java.leetcode.lt1379;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {
	public final TreeNode getTargetCopy(
			final TreeNode original, final TreeNode cloned, final TreeNode target) {
		Deque<TreeNode> oStack = new ArrayDeque<TreeNode>();
		Deque<TreeNode> cStack = new ArrayDeque<TreeNode>();
		TreeNode op = original;
		TreeNode cp = cloned;
		
		while ((op != null && cp !=null) ||
				(!oStack.isEmpty() && !cStack.isEmpty())) {
			while (op != null && cp != null) {
				oStack.addLast(op);
				cStack.addLast(cp);
				op = op.left;
				cp = cp.left;
			}
			
			if (!oStack.isEmpty() && !cStack.isEmpty()) {
				TreeNode oTemp = oStack.pollLast();
				TreeNode cTemp = cStack.pollLast();
				if (oTemp == target) {
					return cTemp;
				}
				op = oTemp.right;
				cp = cTemp.right;
			}
		}
	
        return null;
    }
}

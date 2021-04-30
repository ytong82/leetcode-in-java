package rookie.java.leetcode.lt865;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
	private int maxDepth = 0;
	private Map<Integer, List<List<TreeNode>>> map = new HashMap<Integer, List<List<TreeNode>>>();
	
	public TreeNode subtreeWithAllDeepest(TreeNode root) {
		makeTreeMap(root, 0, new ArrayList<TreeNode>());
		List<List<TreeNode>> maxParents = map.get(maxDepth);
	
		for (int i=0; i<=maxDepth; i++) {
			for (List<TreeNode> parents : maxParents) {
				if (maxParents.get(0).get(i) != parents.get(i)) {
					return maxParents.get(0).get(i-1);
				}
			}
		}
		return maxParents.get(0).get(maxDepth);
    }
	
	private void makeTreeMap(TreeNode root, int depth, List<TreeNode> parents) {
		if (depth > maxDepth) {
			maxDepth = depth;
		}
		parents.add(root);
		if (map.containsKey(depth)) {
			map.get(depth).add(parents);
		} else {
			List<List<TreeNode>> list = new ArrayList<List<TreeNode>>();
			list.add(parents);
			map.put(depth, list);
		}
		if (root.left != null) {
			List<TreeNode> newParents = makeNewParents(parents);
			makeTreeMap(root.left, depth + 1, newParents);
		}
		if (root.right != null) {
			List<TreeNode> newParents = makeNewParents(parents);
			makeTreeMap(root.right, depth + 1, newParents);
		}
	}
	
	private List<TreeNode> makeNewParents(List<TreeNode> parents) {
		List<TreeNode> newParents = new ArrayList<TreeNode>();
		for (TreeNode parent : parents) {
			newParents.add(parent);
		}
		return newParents;
	}
}

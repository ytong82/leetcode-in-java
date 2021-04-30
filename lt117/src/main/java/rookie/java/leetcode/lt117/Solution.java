package rookie.java.leetcode.lt117;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
	private Map<Integer, List<Node>> map = new HashMap<Integer, List<Node>>();
	
	public Node connect(Node root) {
		constructMap(root, 0);
		int index = 0;
		while (map.containsKey(index)) {
			List<Node> nodes = map.get(index);
			for (int i=0; i<nodes.size()-1; i++) {
				nodes.get(i).next = nodes.get(i+1);
			}
			nodes.get(nodes.size()-1).next = null;
			index++;
		}
		return root;
    }
	
	private void constructMap(Node root, int level) {
		if (root != null) {
			if (map.containsKey(level)) {
				map.get(level).add(root);
			} else {
				List<Node> nodes = new ArrayList<Node>();
				nodes.add(root);
				map.put(level, nodes);
			}
			constructMap(root.left, level + 1);
			constructMap(root.right, level + 1);
		}
	}
}

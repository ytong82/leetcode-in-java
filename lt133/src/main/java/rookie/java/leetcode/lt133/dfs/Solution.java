package rookie.java.leetcode.lt133.dfs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import rookie.java.leetcode.lt133.Node;

public class Solution {
	Map<Node, Node> map = new HashMap<Node, Node>();
	public Node cloneGraph(Node node) {
		if (node == null) return node;
		map.put(node, new Node(node.val, new ArrayList<Node>()));
		for (Node neighbor : node.neighbors) {
			if (map.containsKey(neighbor)) {
				map.get(node).neighbors.add(map.get(neighbor));
			} else {
				map.get(node).neighbors.add(cloneGraph(neighbor));
			}
		}
		return map.get(node);
    }
}

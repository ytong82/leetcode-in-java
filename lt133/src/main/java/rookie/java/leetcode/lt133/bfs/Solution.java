package rookie.java.leetcode.lt133.bfs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

import rookie.java.leetcode.lt133.Node;

class Solution {
	Map<Node, Node> map = new HashMap<Node, Node>();
	Queue<Node> queue = new LinkedList<Node>();
    public Node cloneGraph(Node node) {
    	if (node == null) return null;	
    	map.put(node, new Node(node.val, new ArrayList<Node>()));
    	queue.offer(node);
    	while (queue.size() > 0) {
    		Node curr = queue.poll();	
    		for (Node neighbor : curr.neighbors) {
    			if (map.containsKey(neighbor)) {
    				map.get(curr).neighbors.add(map.get(neighbor));
    			} else {
    		    	map.put(neighbor, new Node(neighbor.val, new ArrayList<Node>()));
    				map.get(curr).neighbors.add(map.get(neighbor));
    				queue.offer(neighbor);
    			}		
    		}
    	}
    	return map.get(node);
    }
}
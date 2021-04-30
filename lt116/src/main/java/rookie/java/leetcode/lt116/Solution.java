package rookie.java.leetcode.lt116;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
	public Node connect(Node root) {
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
		queue.add(null);
	
		while (queue.size() > 0) {
			Node curr = queue.poll();
			if (curr != null) {
				if (curr.left != null && curr.right != null) {
					queue.add(curr.left);
					queue.add(curr.right);
				}
				curr.next = queue.peek();
			} else {
				if (queue.size() > 1)
					queue.add(null);
			}
		}
		return root;
    }
}
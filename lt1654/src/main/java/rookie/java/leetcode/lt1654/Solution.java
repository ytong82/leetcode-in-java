package rookie.java.leetcode.lt1654;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
	private List<Integer> forbidden = new ArrayList<Integer>();
	
	private class Node {
		public int index;
		public boolean left;
		public int value;
		Node (int index, boolean left, int value) {
			this.index = index;
			this.left = left;
			this.value = value;
		}
		@Override
		public String toString() {
			return String.format("index: %s, left: %s, value %s", this.index, this.left, this.value);
		}
	}
	
	public int minimumJumps(int[] forbidden, int a, int b, int x) {
		int count = 0;
		Queue<Node> queue = new LinkedList<Node>();
		List<Integer> searched = new ArrayList<Integer>();
		queue.add(new Node(0, false, 0));
		while(queue.size() > 0 && count < 10000) {
			count++;
			Node parent = queue.poll();	
			// get left child
			if (!parent.left) {
				int val = parent.value - b;
				if (val > 0 && !isForbidden(forbidden, val)) {
					Node node = new Node(parent.index + 1, true, val);
					if (!searched.contains(val)) {
						//System.out.println(node);
						if (val == x) {
							return parent.index + 1;
						} 
						queue.add(node);
						searched.add(node.value);
					}
				}
 			}
			// get right child
			int val = parent.value + a;
			if (!isForbidden(forbidden, val)) {
				Node node = new Node(parent.index + 1, false, val);
				if (!searched.contains(val)) {
					//System.out.println(node);
					if (val == x) {
						return parent.index + 1;
					} 
					queue.add(node);
					searched.add(node.value);
				}
			}
		}
		return -1;
    }
	
	private boolean isForbidden(int[] forbidden, int val) {
		if (forbidden.length == 0) {
			return false;
		} else {
			if (this.forbidden.size() == 0 ) {
				for (int i=0; i<forbidden.length; i++) {
					this.forbidden.add(forbidden[i]);
				}
			}
		}
		return this.forbidden.contains(val);
	}
}

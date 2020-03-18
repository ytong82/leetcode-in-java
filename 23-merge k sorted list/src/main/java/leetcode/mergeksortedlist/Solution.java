package leetcode.mergeksortedlist;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution {
	private class ListNodeComparator implements Comparator<ListNode> {
		public int compare(ListNode o1, ListNode o2) {
			return o1.val - o2.val;
		}
	}
	
	public ListNode mergeKLists(ListNode[] lists) {
		PriorityQueue<ListNode> pq = new PriorityQueue<ListNode>(new ListNodeComparator());
		
		for (int i=0; i<lists.length; ++i) {
			ListNode ln = lists[i];
			if (ln != null) {
				pq.offer(ln);
			}
		}
		
		ListNode head = null;
		ListNode current = null;
		ListNode previous = null;
		
		while (pq.size() > 0) {
			ListNode ln = pq.poll();
			if (ln.next != null) {
				pq.add(ln.next);
			}
			
			if (head == null) {
				head = ln;
				current = ln;
			} else {
				previous = current;
				current = ln;
				previous.next = current;
			}			
		}
		return head;
	}
}
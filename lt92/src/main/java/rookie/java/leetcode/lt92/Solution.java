package rookie.java.leetcode.lt92;

public class Solution {
	public ListNode reverseBetween(ListNode head, int m, int n) {
		// pre-check
		if (m == n) {
			return head;
		}
		
		// initialize
		ListNode begin = null;
		ListNode end = null;
		ListNode subHead = null;
		ListNode subTail = null;
		
		// reverse the linked list from m to n
		ListNode curr = head;
		ListNode prev = null;
		int index = 1;
		while (curr != null) {
			if (index == m) {
				begin = prev;
				subHead = curr;
			} else if (index == n) {
				subTail = curr;
				end = curr.next;
				break;
			}
			prev = curr;
			curr = curr.next;
			index++;
		}
		
		reverseLinkedList(subHead, n - m);
		if (begin == null) {
			subHead.next = end;
			return subTail;
		} else {
			begin.next = subTail;
			subHead.next = end;
			return head;
		} 
    }
	
	private void reverseLinkedList(ListNode head, int steps) {
		ListNode prev = head;
		ListNode curr = head.next;
		int index = 1;
		while (curr != null && index <= steps) {
			ListNode next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
			index++;
		}
	}
}

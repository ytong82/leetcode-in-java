package rookie.java.leetcode.lt61;

public class Solution {
	public ListNode rotateRight(ListNode head, int k) {
		if (head == null) {
			return null;
		}
		
		int listLen = getListLen(head);
		int gap = k % listLen;
		
		ListNode slow = head;
		ListNode fast = head;
		for (int i=0; i<gap; i++) {
			fast = fast.next;
		}
		
		while (fast.next != null) {
			slow = slow.next;
			fast = fast.next;
		}
		
		
		fast.next = head;
		head = slow.next;
		slow.next = null;
		
		return head;
    }
	
	private int getListLen(ListNode head) {
		int length = 0;
		ListNode node = head;
		while (node != null) {
			node = node.next;
			length++;
		}
		return length;
	}
}

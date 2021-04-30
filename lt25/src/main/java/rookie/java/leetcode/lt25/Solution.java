package rookie.java.leetcode.lt25;

public class Solution {
	public ListNode reverseKGroup(ListNode head, int k) {
		ListNode curr = head;
		for (int i=0; i<k; i++) {
			if (curr == null) {
				return head;
			}
			curr = curr.next;
		}
		
		ListNode left = head;
		ListNode right = head.next;
		ListNode tmp = null;
		for (int i=0; i<k-1; i++) {
			tmp = right.next;
			right.next = left;
			left = right;
			right = tmp;
		}
		head.next = reverseKGroup(right, k);
		return left;
    }
}

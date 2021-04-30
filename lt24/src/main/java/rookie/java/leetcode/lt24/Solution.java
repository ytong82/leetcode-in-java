package rookie.java.leetcode.lt24;

public class Solution {
	public ListNode swapPairs(ListNode head) {
		if (head == null)
			return null;
		
		ListNode left = head;
		ListNode right = left.next;
		
		if (right != null) {
			if (right.next != null) {
				left.next = swapPairs(right.next);
			} else {
				left.next = null;
			}
			right.next = left;
			return right;
		} else {
			return left;
		}
    }
}

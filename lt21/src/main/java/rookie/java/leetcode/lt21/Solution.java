package rookie.java.leetcode.lt21;

public class Solution {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode head = null;
		if (l1 != null && l2 != null) {
			if (l1.val <= l2.val) {
				head = l1;
				head.next = this.mergeTwoLists(l1.next, l2);
			} else {
				head = l2;
				head.next = this.mergeTwoLists(l1, l2.next);
			}
		} else if (l1 == null) {
			head = l2;
		} else if (l2 == null) {
			head = l1;
		} else {
			head = null;
		}
		return head;
    }
}
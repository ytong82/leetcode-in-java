package leetcode.removenthnodefromendoflist;

public class Solution {
	public ListNode removeNthFromEnd(ListNode head, int n) {
		if (head == null) {
			return null;
		}
		
        int nodeNum = 0;
        ListNode current = head;
        while (current != null) {
        	nodeNum++;
        	current = current.next;
        }
        
        int anchor = nodeNum - n;
        int count = 0;
        
        if (anchor == 0) {
        	head = head.next;
        }
        
        current = head;
        while (current != null) {
        	count++;
        	if (anchor == count) {
        		current.next = current.next.next;
        		break;
        	}
        	current = current.next;
        }
		return head;
    }
}

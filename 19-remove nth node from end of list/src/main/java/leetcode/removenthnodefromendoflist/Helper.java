package leetcode.removenthnodefromendoflist;

public class Helper {
	public ListNode createLinkedList(int[] arr) {
		if (arr.length == 0) {
			return null;
		}
		
		ListNode head = new ListNode(arr[0]);
		ListNode current = head;
		for (int i=1; i<arr.length; ++i) {
			ListNode node = new ListNode(arr[i]);
			current.next = node;
			current = current.next;
		}
		return head;
	}
	
	public void printLinkedList(ListNode head) {
		ListNode current = head;
		while (current != null) {
			System.out.print(current.val);
			if (current.next != null) {
				System.out.print("->");
			}
			current = current.next;
		}
		System.out.println();
	}
}
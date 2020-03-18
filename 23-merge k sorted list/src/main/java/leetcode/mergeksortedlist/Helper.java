package leetcode.mergeksortedlist;

public class Helper {
	public ListNode[] createListNode(int[][] arrays) {
		ListNode[] lists = new ListNode[arrays.length];
		ListNode previous = null;
		ListNode current = null;
		
		for (int i=0; i<arrays.length; ++i) {
			for (int j=0; j<arrays[i].length; ++j) {		
				if (j == 0) {
					current = new ListNode(arrays[i][j]);
					lists[i] = current;
				} else {
					previous = current;
					current = new ListNode(arrays[i][j]);
					previous.next = current;
				}
			}
		}
		return lists;
	}
	
	public void printListNode(ListNode listNode) {
		ListNode cursor = listNode;
		while (cursor != null) {
			if (cursor.next == null) {
				System.out.print(cursor.val);
			} else {
				System.out.print(cursor.val + "->");
			}
			cursor = cursor.next;
		}
		System.out.println();
	}
}

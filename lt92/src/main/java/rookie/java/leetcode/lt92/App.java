package rookie.java.leetcode.lt92;

public class App {
    public static void main( String[] args ) {
        ListNode head = new ListNode(1);
        ListNode node = new ListNode(2);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(4);
        ListNode node4 = new ListNode(5);
        head.next = node;
        node.next = node2;
        node2.next = node3;
        node3.next = node4;
        
        Solution solution = new Solution();
        ListNode curr  = solution.reverseBetween(head, 1, 5);
        
        while (curr != null) {
        	System.out.printf("%s -> ", curr.val);
        	curr = curr.next;
        }
        System.out.println();
    }
}

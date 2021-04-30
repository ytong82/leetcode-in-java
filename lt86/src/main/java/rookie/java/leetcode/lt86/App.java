package rookie.java.leetcode.lt86;

public class App {
    public static void main( String[] args ) {
        ListNode node = new ListNode(1);
        ListNode node2 = new ListNode(4);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(2);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(2);
        node.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        
        Solution solution = new Solution();
        ListNode head = solution.partition(node, 3);
        while (head != null) {
        	System.out.printf("%s -> ", head.val);
        	head = head.next;
        }
    }
}

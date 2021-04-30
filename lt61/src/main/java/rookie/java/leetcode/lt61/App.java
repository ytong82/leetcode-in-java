package rookie.java.leetcode.lt61;

public class App {
    public static void main( String[] args ) {
        ListNode head = new ListNode(1);
        ListNode node = new ListNode(2);
        ListNode node2 = new ListNode(3);
        //ListNode node3 = new ListNode(4);
        //ListNode node4 = new ListNode(5);
        head.next = node;
        node.next = node2;
        node2.next = null;
        //node3.next = node4;
        //node4.next = null;
        
        Solution solution = new Solution();
        head = solution.rotateRight(null, 20000);
        
        while (head != null) {
        	System.out.print(head.val + "->");
        	head = head.next;
        }
        System.out.println("NULL");
    }
}

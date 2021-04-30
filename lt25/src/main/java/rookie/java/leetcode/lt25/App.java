package rookie.java.leetcode.lt25;

public class App {
    public static void main( String[] args ) {
        ListNode node = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        
    	ListNode head = node;
    	node.next = node2;
    	node2.next = node3;
    	node3.next = node4;
    	node4.next = node5;
    	
    	Solution solution = new Solution();
    	head = null;
    	head = solution.reverseKGroup(head, 1);
    	print(head);
    }
    
    private static void print( ListNode head ) {
    	while (head != null) {
    		System.out.printf("%s,", head.val);
    		head = head.next;
    	}
    }
}
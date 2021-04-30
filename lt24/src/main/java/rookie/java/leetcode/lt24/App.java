package rookie.java.leetcode.lt24;

public class App {
    public static void main( String[] args ) {
        ListNode node = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        
    	ListNode head = node;
    	node.next = node2;
    	node2.next = node3;
    	node3.next = node4;
    	
    	Solution solution = new Solution();
    	node3.next = null;
    	head = solution.swapPairs(head);
    	print(head);
    }
    
    private static void print( ListNode head ) {
    	while (head != null) {
    		System.out.printf("%s,", head.val);
    		head = head.next;
    	}
    }
}

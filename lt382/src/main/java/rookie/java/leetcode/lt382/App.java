package rookie.java.leetcode.lt382;

import rookie.java.leetcode.lt382.randomized.Solution;

public class App {
    public static void main( String[] args ) {
    	ListNode head = new ListNode(1);
    	head.next = new ListNode(2);
    	head.next.next = new ListNode(3);
    	Solution solution = new Solution(head);
    	for (int i=0; i<10; i++) {
    		System.out.println(solution.getRandom());
    	}
    }
}

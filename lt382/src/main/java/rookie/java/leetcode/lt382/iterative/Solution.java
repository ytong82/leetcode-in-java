package rookie.java.leetcode.lt382.iterative;

import java.util.Random;

import rookie.java.leetcode.lt382.ListNode;

public class Solution {
	private int listLen;
	private Random random;
	private ListNode head;
	
	public Solution(ListNode head) {
        this.listLen = 0;
        this.random = new Random(1000);
        this.head = head;
        
		ListNode curr = head;
		while (curr != null) {
			this.listLen++;
        	curr = curr.next;
        }
    }
	
	public int getRandom() {
       int randInt = this.random.nextInt(this.listLen);
       ListNode curr = head;
       while (randInt > 0 && curr != null) {
    	   randInt--;
    	   curr = curr.next;
       }
       return curr.val;
    }
}

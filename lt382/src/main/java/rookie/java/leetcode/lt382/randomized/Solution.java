package rookie.java.leetcode.lt382.randomized;

import java.util.Random;

import rookie.java.leetcode.lt382.ListNode;

public class Solution {
	Random random;
	ListNode head;
	
	public Solution(ListNode head) {
		this.random = new Random(1000);
		this.head = head;
	}
	
	public int getRandom() {
		int i = 0;
		int res = 0;
		ListNode curr = this.head;
		
		while (curr != null) {
			if (this.random.nextInt(++i) == 0) {
				res = curr.val;				
			}
			curr = curr.next;
		}
		return res;
	}
}

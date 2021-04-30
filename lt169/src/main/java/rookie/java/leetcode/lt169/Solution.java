package rookie.java.leetcode.lt169;

import java.util.Deque;
import java.util.LinkedList;

public class Solution {
	Deque<Integer> stack = new LinkedList<Integer>();
	
	public int majorityElement(int[] nums) {
		int start = 0;
		if (nums.length % 2 == 1) {
			addElement(nums[0]);
			start = 1;
		}
		for (int i=start; i<nums.length; i+=2) {
			if (nums[i] == nums[i+1]) {
				addElement(nums[i]);
				addElement(nums[i+1]);			
			} 
		}
		return this.stack.size() > 0 ? this.stack.peekFirst() : -1;
    }
	
	private void addElement(int element) {
		if (this.stack.size() > 0) {
			if (this.stack.peekLast() == element) {
				this.stack.addLast(element);
			} else {
				this.stack.pollLast();
			}
		} else {
			this.stack.addLast(element);
		}
	}
}

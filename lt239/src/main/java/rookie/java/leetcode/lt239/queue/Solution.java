package rookie.java.leetcode.lt239.queue;

import java.util.Deque;
import java.util.LinkedList;

public class Solution {
	public int[] maxSlidingWindow(int[] nums, int k) {
		Deque<Integer> queue = new LinkedList<Integer>();
		int[] res = new int[nums.length-k+1];
		for (int i=0; i<nums.length; i++) {
			while (queue.size() > 0 && nums[queue.getLast()] < nums[i]) {
				queue.removeLast();
			}
			queue.addLast(i);
			if (i-k+1 >= 0) {
				res[i-k+1] = nums[queue.getFirst()];
			}
			if (i-k+1 >= queue.getFirst()) {
				queue.removeFirst();
			}
		}		
		return res;
	}
}

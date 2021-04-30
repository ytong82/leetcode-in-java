package rookie.java.leetcode.lt239.heap;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Solution {
	public int[] maxSlidingWindow(int[] nums, int k) {	
		Comparator<Integer> cmp = new Comparator<Integer>() {
			public int compare(Integer e1, Integer e2) {
				return e2 - e1;
			}
			
		};
		Queue<Integer> heap = new PriorityQueue<Integer>(k, cmp);
		for (int i=0; i<k; i++) {
			heap.add(nums[i]);
		}
		
		int[] res = new int[nums.length-k+1];
		res[0]= heap.peek();
		
		for (int i=k; i<nums.length; i++) {
			heap.remove(nums[i-k]);
			heap.offer(nums[i]);
			res[i-k+1] = heap.peek();
		}
		return res;
    }
}

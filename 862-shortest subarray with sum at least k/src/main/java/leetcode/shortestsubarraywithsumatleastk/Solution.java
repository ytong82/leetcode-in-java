package leetcode.shortestsubarraywithsumatleastk;

import java.util.ArrayDeque;

public class Solution {
	public int shortestSubarray(int[] A, int K) {
		int length = A.length;
		int[] sums = new int[length+1];
		
		for (int i=1; i<=length; ++i) {
			sums[i] = sums[i-1] + A[i-1];
		}
		
		int minLength = Integer.MAX_VALUE;
		
		
		ArrayDeque<Integer> dq = new ArrayDeque<Integer>();
		for (int i=0; i<sums.length; ++i) {
			if (i > 0) {
				while (dq.size() > 0 && sums[dq.peekLast()] >= sums[i]) {
					dq.pollLast();
				}
				
				while (dq.size() > 0 && sums[i] - sums[dq.peekFirst()] >= K) {
					minLength = Math.min(minLength, i - dq.pollFirst());
				}
			}
			dq.addLast(i);
		}
		
		return minLength == Integer.MAX_VALUE ? -1 : minLength;
    }
}

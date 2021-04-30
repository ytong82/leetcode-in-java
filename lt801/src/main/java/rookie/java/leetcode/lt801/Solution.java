package rookie.java.leetcode.lt801;

import java.util.Arrays;

public class Solution {
	public int minSwap(int[] A, int[] B) {
		int keep[] = new int[A.length];
		int swap[] = new int[A.length];
		Arrays.fill(keep, A.length+1);
		Arrays.fill(swap, A.length+1);
		keep[0] = 0;
		swap[0] = 1;
		
		for (int i=1; i<A.length; i++) {
			if (A[i] > A[i-1] && B[i] > B[i-1]) {
				keep[i] = keep[i-1];
				swap[i] = swap[i-1] + 1;
			}
			if (B[i] > A[i-1] && A[i] > B[i-1]) {
				keep[i] = Math.min(keep[i], swap[i-1]);
				swap[i] = Math.min(swap[i], keep[i-1] + 1);
			}
		} 
		return Math.min(keep[A.length - 1], swap[A.length - 1]);
    }
}

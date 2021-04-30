package rookie.java.leetcode.lt910;

import java.util.Arrays;

public class Solution {
	public int smallestRangeII(int[] A, int K) {
		// initialize
		int N = A.length;
		Arrays.parallelSort(A);
		
		// loop
		int minRange = A[N-1] - A[0];
		for (int i=0; i<N-1; i++) {
			int maxVal = Math.max(A[N-1] - K, A[i] + K);
			int minVal = Math.min(A[0] + K, A[i+1] - K);
			minRange = Math.min(minRange, maxVal - minVal);
		}
		
		// return
		return minRange;
    }
}

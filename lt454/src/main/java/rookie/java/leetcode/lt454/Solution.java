package rookie.java.leetcode.lt454;

import java.util.HashMap;
import java.util.Map;

public class Solution {
	public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
		// build map
		Map<Integer, Integer> mapAB = new HashMap<Integer, Integer>();

		for (int i=0; i<A.length; i++) {
			for (int j=0; j<B.length; j++) {
				int key = A[i] + B[j];
				if (mapAB.containsKey(key)) {
					mapAB.put(key, mapAB.get(key) + 1);
				} else {
					mapAB.put(key, 1);
				}
			}
		}
		
		// mapping
		int count = 0;
		for (int i=0; i<C.length; i++) {
			for (int j=0; j<D.length; j++) {
				int key = 0 - C[i] - D[j];
				if (mapAB.containsKey(key)) {
					count += mapAB.get(key);
				}
			}
		}
		
		return count;
    }
}

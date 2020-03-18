package leetcode.advantageshuffle;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution {
	public int[] advantageCount(int[] A, int[] B) {
		Arrays.sort(A);
		
		List<Integer> sorted = new LinkedList<Integer>();
		for (int a : A) {
			sorted.add(a);
		}
		
		int[] res = new int[A.length];
		
		int index;
		for(int i = 0; i < B.length; ++i) {	
			index = this.binarySearch(sorted, B[i]);
			if (index != -1) {
				res[i] = sorted.get(index);
				sorted.remove(index);
			} else {
				res[i] = sorted.get(0);
				sorted.remove(0);
			}
		}
		return res;
	}
	
	private int binarySearch(List<Integer> A, int n) {
		int left = 0;
		int right = A.size() - 1;
		
		while (left <= right) {
			int middle = left + (right - left) / 2;
			if (A.get(middle) > n) {
				if (middle == 0 || A.get(middle-1) <= n) {
					return middle;
				}
				right = middle - 1;
			} else {
				left = middle + 1;
			}
		}
		return -1;
	}
}

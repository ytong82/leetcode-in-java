package rookie.java.leetcode.lt845;

public class Solution {
	public int longestMountain(int[] A) {
		if (A.length < 3) {
			return 0;
		}
		
		int[] up = new int[A.length];
		int[] down = new int[A.length];
		
		up[0] = 0;
		for (int i=1; i<A.length; i++) {
			if (A[i] > A[i-1]) {
				up[i] = up[i-1] + 1;
			} else {
				up[i] = 0;
			}
		}
		
		down[A.length-1] = 0;
		for (int i= A.length-2; i>=0; i--) {
			if (A[i] > A[i+1]) {
				down[i] = down[i+1] + 1;
			} else {
				down[i] = 0;
			}
		}
		
		int res = -1;
		for (int i=0; i<A.length-1; i++) {
			if (up[i] + down[i] > res) {
				if (up[i] > 0 && down[i] > 0) {
					res = up[i] + down[i];
				}
			}
		}
		
		return res + 1;
    }
}

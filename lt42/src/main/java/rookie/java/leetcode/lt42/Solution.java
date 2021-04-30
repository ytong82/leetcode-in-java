package rookie.java.leetcode.lt42;

public class Solution {
	public int trap(int[] height) {
		int N = height.length;
		if (N < 3) {
			return 0;
		}
		
		int[] left = new int[N];
		int[] right = new int[N];
		
		// get left border heights
		int max = 0;
		for (int i=0; i<N; i++) {
			if (max < height[i]) {
				max = height[i];
			}
			left[i] = max;
		}
		
		// get right border heights
		max = 0;
		for (int i=N-1; i>=0; i--) {
			if (max < height[i]) {
				max = height[i];
			}
			right[i] = max;
		}
		right[N-1] = 0;
		
		// get rain water
		int water = 0;
		for (int i=0; i<N; i++) {
			water += Math.max(0, 1 * (Math.min(left[i], right[i]) - height[i]));
		}
		
		return water;
    }
}

package rookie.java.leetcode.lt11;

public class Solution {
	public int maxArea(int[] height) {
		int[] dp = new int[height.length];
		dp[0] = 0;
		for (int i=1; i<height.length; i++) {
			int maxVol = 0;
			for (int j=0; j<=i; j++) {
				int volume = Math.min(height[i], height[j]) * (i - j); 
				if (maxVol < volume) {
					maxVol = volume;
				}
			}
			dp[i] = maxVol;
		}
		
		int maxVol = 0;
		for (int i=1; i<height.length; i++) {
			if (maxVol < dp[i]) {
				maxVol = dp[i];
			}
		}
		return maxVol;
	}
}

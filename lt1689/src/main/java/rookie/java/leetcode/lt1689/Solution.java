package rookie.java.leetcode.lt1689;

public class Solution {
	public int minPartitions(String n) {
		int max = 0;
		for (int i=0; i<n.length(); i++) {
			int val = n.charAt(i) - '0';
			if (val > max) {
				max = val;
			}
		}
		return max;
    }
}

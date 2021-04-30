package rookie.java.leetcode.lt754;

public class Solution {
	public int reachNumber(int target) {
		target = Math.abs(target);
		
		int sum = 0;
		int index = 1;
		while (sum < target) {
			sum += index;
			index++;
		}
		
		index--;
		if ((sum - target) % 2 == 0) {
			return index;
		} else {
			if (index % 2 == 0) {
				return index + 1;
			} else {
				return index + 2;
			}
		}
    }
}

package rookie.java.leetcode.lt334;

public class Solution {
	public boolean increasingTriplet(int[] nums) {		
		int min = Integer.MAX_VALUE;
		int min2 = Integer.MAX_VALUE;
		
		for (Integer num : nums) {
			if (num < min) {
				min = num;
			} else if (num > min && num < min2){
				min2 = num;
			} else if (num > min2) {
				return true;
			}
		}
		return false;
    }
}

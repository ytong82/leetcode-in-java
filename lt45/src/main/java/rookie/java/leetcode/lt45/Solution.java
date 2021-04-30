package rookie.java.leetcode.lt45;

public class Solution {
	public int jump(int[] nums) {
		int res = 0, curr = 0, last = 0;
		for (int i=0; i<nums.length-1; i++) {
			curr = Math.max(curr, i + nums[i]);
			if (last == i) {
				last = curr;
				res++;
				if (curr >= nums.length - 1) {
					break;
				}
			}
		}
		return res;
    }
}

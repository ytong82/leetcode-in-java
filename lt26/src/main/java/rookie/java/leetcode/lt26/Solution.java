package rookie.java.leetcode.lt26;

public class Solution {
	public int removeDuplicates(int[] nums) {
		int slow = 0, fast = 1;
		for (; fast<nums.length; fast++) {
			if (nums[slow] != nums[fast]) {
				slow++;
				nums[slow] = nums[fast];
			}
		}
		return slow + 1;
    }
}

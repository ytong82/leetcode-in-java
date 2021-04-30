package rookie.java.leetcode.lt80;

public class Solution {
	public int removeDuplicates(int[] nums) {
		int slow = 0, fast = 1;
		int count = 1, max = 2;	
		for (; fast < nums.length; fast++) {
			if (nums[slow] != nums[fast]) {
				slow++;
				nums[slow] = nums[fast];
				count = 1;
			} else {
				if (count < max) {
					slow++;
					nums[slow] = nums[fast];
					count++;
				}
			}
		}	
		return slow + 1;
    }
}

	
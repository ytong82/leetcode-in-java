package rookie.java.leetcode.lt27;

public class Solution {
	public int removeElement(int[] nums, int val) {
		int left = 0;
		int right = nums.length - 1;
		
		int count = 0;
		while (left <= right) {
			if (nums[left] == val) {
				count++;
				while (left < right && nums[right] == val) {
					right--;
					count++;
				}
				if (left < right) {
					nums[left] = nums[right];
					left++;
					right--;
				} else {
					return left;
				}
			} else {
				left++;
			}
		}
		return nums.length - count;
    }
}

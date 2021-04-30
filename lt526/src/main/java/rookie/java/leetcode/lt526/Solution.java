package rookie.java.leetcode.lt526;

public class Solution {
	int count = 0;
	
	public int countArrangement(int n) {
		// initialize 
		count = 0;
		int[] nums = new int[n];
		for (int i=0; i<n; i++) {
			nums[i] = i + 1;
		}
		permute(nums, 0);
		return count;
	}
	
	private void permute(int[] nums, int l) {
		if (l == nums.length) {
			count++;
		}
		for (int i=l; i<nums.length; i++) {
			swap(nums, l, i);
			if ((nums[l] % (l+1) == 0) || ((l+1) % nums[l] == 0)) {
				permute(nums, l+1);
			}
			swap(nums, i, l);
		}
	}
	
	private void swap(int[] nums, int x, int y) {
		int temp = nums[x];
		nums[x] = nums[y];
		nums[y] = temp;
	}
}

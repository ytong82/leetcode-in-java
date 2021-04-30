package rookie.java.leetcode.lt941;

public class Solution {
	public boolean validMountainArray(int[] arr) {
		if (arr.length < 3) {
			return false;
		}
		
		int peak = -1;
		for (int i=0; i<arr.length-1; i++) {
			if (arr[i] > arr[i+1]) {
				peak = i;
				break;
			} else if (arr[i] == arr[i+1]) {
				return false;
			}
		}
		
		if (peak == -1 || peak == 0) {
			return false;
		}
		
		for (int i=peak; i<arr.length-1; i++) {
			if (arr[i] <= arr[i+1]) {
				return false;
			}
		}
		return true;
    }

}

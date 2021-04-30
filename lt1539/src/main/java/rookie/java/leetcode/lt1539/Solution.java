package rookie.java.leetcode.lt1539;

public class Solution {
	public int findKthPositive(int[] arr, int k) {
		int N = arr.length;
		int count = 0;
		for (int i=0, j=1; i<N; j++) {
			if (arr[i] == j) {
				i++;
			} else {
				count++;
			}
			if (count == k) {
				return j;
			}
		}	
        return arr[N-1] + k - count;
    }
}

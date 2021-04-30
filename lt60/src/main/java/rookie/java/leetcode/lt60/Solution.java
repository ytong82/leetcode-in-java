package rookie.java.leetcode.lt60;

public class Solution {
	public String getPermutation(int n, int k) {
        int[] permutation = new int[n];
		for (int i=1; i<=n; i++) {
			permutation[i-1] = i;
		}
		
		// get kth permutation
		for (int i=0; i<k-1; i++) {
			for (int j=n-1; j>0; j--) {
				if (permutation[j] > permutation[j-1]) {
					for (int z=n-1; z>j-1; z--) {
						if (permutation[z] > permutation[j-1]) {
							swap(permutation, j-1, z);
							transpose(permutation, j, n-1);
							break;
						}
					}
					break;
				}
			}
 		}
		
		// get res
		String res = "";
		for (int i=0; i<n; i++) {
			res += permutation[i];
		}
		return res;
    }
	
	private void swap(int[] permutation, int i, int j) {
		int temp = permutation[i];
		permutation[i] = permutation[j];
		permutation[j] = temp;
	}
	
	private void transpose(int[] permutation, int left, int right) {
		while (left < right) {
			swap(permutation, left, right);
			left++;
			right--;
		}
	}
}

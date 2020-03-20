package leetcode.maximumlengthofrepeatedsubarray;

public class Solution {
	public int findLength(int[] A, int[] B) {
		int lenA = A.length;
		int lenB = B.length;
		
		int[][] dp = new int[lenA][lenB];
		int res = 0;
		for (int i=0; i<lenA; ++i) {
			for (int j=0; j<lenB; ++j) {
				if ( lenA - i < res || lenB - j < res ) {
					continue;
				}
				
				for (int k=0; i+k<lenA && j+k<lenB; ++k) {
					if (A[i+k] != B[j+k]) {
						dp[i][j] = k;
						break;
					}
					if ( i + k == lenA - 1 || j + k == lenB -1 ) {
						dp[i][j] = k + 1;
					}
				}
				if (res < dp[i][j]) {
					res = dp[i][j];
				}
			}
		}
		return res;
    }
}

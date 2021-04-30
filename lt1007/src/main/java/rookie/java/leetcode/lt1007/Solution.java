package rookie.java.leetcode.lt1007;

public class Solution {
	public int minDominoRotations(int[] A, int[] B) {
        int mode = 0;
		for (int i=1; i<=6; i++) {
        	long sum = 0;
        	for(int j=0; j<A.length; j++) {
        		sum += Math.abs((A[j] - i) * (B[j] - i));
        	}
        	if (sum == 0) {
        		mode = i;
        		break;
        	} 
        } 
		
		if (mode == 0) {
        	return -1;
        }
		 
        
        int countA = 0;
		for (int i=0; i<A.length; i++) {
			if ( mode == A[i]) {
				countA++;
			}
		}
		
		int countB = 0;
		for (int i=0; i<B.length; i++) {
			if ( mode == B[i]) {
				countB++;
			}
		}
		
		return countA > countB ? A.length - countA : B.length - countB;
    }
}

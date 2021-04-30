package rookie.java.leetcode.lt738;

public class Solution {
	public int monotoneIncreasingDigits(int N) {
		// input
        String[] inputs = Integer.toString(N).split("");
        int L = inputs.length;
		int[] digits = new int[L];
		for (int i=0; i<L; i++) {
			digits[i] = Integer.parseInt(inputs[i]);
		}
		
		// greedy search
		int start = L;
		for (int i=L-2; i>=0; i--) {
			if (digits[i] > digits[i+1]) {
				digits[i] -= 1;
				start = i;
			}
		}
		
		for (int i=start+1; i<L; i++) {
				digits[i] = 9;
		}
		
		// return
		int res = 0;
		for (int i=0; i<L; i++) {
			res *= 10;
			res += digits[i];
		}
		return res;
    }
}

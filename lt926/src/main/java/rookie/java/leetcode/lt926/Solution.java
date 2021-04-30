package rookie.java.leetcode.lt926;

public class Solution {
	public int minFlipsMonoIncr(String S) {
		int N = S.length();
		int[] flip = new int[N];
		int[] keep = new int[N];
		flip[0] = 1;
		keep[0] = 0;
		
		for (int i=1; i<N; i++) {
			if (S.charAt(i-1) == '0') {
				if (S.charAt(i) == '0') {
					flip[i] = Math.min(flip[i-1] + 1, keep[i-1] + 1);
					keep[i] = keep[i-1];
				} else {
					flip[i] = keep[i-1] + 1;
					keep[i] = Math.min(flip[i-1], keep[i-1]);
				}
			} else {
				if (S.charAt(i) == '0') {
					flip[i] = Math.min(flip[i-1] + 1, keep[i-1] + 1);
					keep[i] = flip[i-1];
				} else {
					flip[i] = flip[i-1] + 1;
					keep[i] = Math.min(flip[i-1], keep[i-1]);
				}
			}
		}
		return Math.min(flip[N-1], keep[N-1]);
    }
}

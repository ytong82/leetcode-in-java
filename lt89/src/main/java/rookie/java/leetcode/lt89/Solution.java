package rookie.java.leetcode.lt89;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
	public List<Integer> grayCode(int n) {
		if (n == 0) {
			List<Integer> res = new ArrayList<Integer>();
			res.add(0);
			return res;
		}
		
		// initialize
		int N = (int) Math.pow(2, n);
		char[][] codes = new char[N][n];
		for (char[] code : codes) {
			Arrays.fill(code, '0');
		}
		codes[1][n-1] = '1'; 
		
		// loop
		int j = 0;
		int mirror = 0;
		for (int i=2; i<N; i++) {
			if (i == Math.pow(2, j+1)) {
				j++;
				mirror = i;
			}
			codes[i][n-j-1] = '1';
			int	pair = mirror - (i - mirror + 1);
			for (int k=n-1; k>n-j-1; k--) {
				codes[i][k] = codes[pair][k];
			}
		}
		
		// result
		List<Integer> res = new ArrayList<Integer>();
		for (char code[] : codes) {
			String binary = new String(code);
			res.add(Integer.parseInt(binary, 2));
		}
		
        return res;
    }
}

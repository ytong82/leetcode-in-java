package rookie.java.leetcode.lt1015;

import java.util.HashSet;
import java.util.Set;

public class Solution {
	private int[] indivs = {0,2,4,5,6,8};
	public int smallestRepunitDivByK(int K) {
		int remain = K % 10;
		for (int i=0; i<indivs.length; i++) {
			if (indivs[i] == remain) {
				return -1;
			}
		}
		
		Set<Integer> checked = new HashSet<Integer>();
		int mod = 0;
		int res = 0;
		while (true) {
			mod = (10 * mod + 1) % K;
			res++;
			if (mod == 0) {
				return res; 
			}
			if (checked.contains(mod)) {
				return -1;
			} else {
				checked.add(mod);
			}
		}
    }
}

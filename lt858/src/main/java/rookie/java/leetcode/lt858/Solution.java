package rookie.java.leetcode.lt858;

public class Solution {
	public int mirrorReflection(int p, int q) {
		// short path
		if (q == 0) {
			return 0;
		}
		
		// do reduction for q/p
		for (int i=q; i>1; i--) {
			if (p % i == 0 && q % i == 0) {
				p = p / i;
				q = q / i;
				break;
			}
		}
		
		if (p % 2 == 0) {
			return 2;
		} else {
			if (q % 2 == 0) {
				return 0;
			} else {
				return 1;
			}
		}
	}
}

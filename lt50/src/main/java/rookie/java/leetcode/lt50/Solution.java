package rookie.java.leetcode.lt50;

public class Solution {
	public double myPow(double x, int n) {
		if (x == 1) {
			return 1.0;
		} else if (x == -1) {
			return n % 2 == 1? -1 : 1;	
		}
		
		Long pow = new Long(n);
		if ( pow < 0) {
			pow = -pow;
		} else if ( n == 0) {
			return 1.0;
		} 
		
		double res = x; 
		for (int i=1; i<pow; i++) {
			res *= x;
			if (res > Long.MAX_VALUE && n < 0) {
				return 0;
			}
		}
		
		if (n < 0) {
			return 1.0 / res;
		} else {
			return res;
		}
    }
}

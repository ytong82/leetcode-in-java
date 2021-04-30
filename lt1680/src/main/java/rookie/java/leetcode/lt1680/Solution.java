package rookie.java.leetcode.lt1680;

public class Solution {
	public int concatenatedBinary(int n) {
		long size = 0, result = 0;
		int ma = (int)1e9+7;

		for(int i = 1;i<=n;i++) {
			// whenever i is power of 2
			if((i & (i-1)) == 0) {
				size++;
			}
			result = ((result << size) % ma + i) % ma;
		}
		return (int)result;
    }
}

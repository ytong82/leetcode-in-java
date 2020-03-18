package leetcode.firstbadversion;

public class Solution extends VersionControl {
	public Solution(int firstBadVersion) {
		super(firstBadVersion);
	}
	
	public int firstBadVersion(int n) {
		return this.doBinarySearch(1,  n);
	}
	
	private int doBinarySearch(int left, int right) {
		if (left <= right) {
			int middle = left + (right - left) / 2;
			boolean isBVCurr = this.isBadVersion(middle);
			boolean isBVNext = this.isBadVersion(middle + 1);
			
			if (isBVCurr == false && isBVNext == true) {
				return middle + 1;
			} else if (isBVCurr == true && isBVNext == true ) {
				return this.doBinarySearch(left, middle - 1);
			} else {
				return this.doBinarySearch(middle + 1, right);
			}
		}
		return 1;
	}
}

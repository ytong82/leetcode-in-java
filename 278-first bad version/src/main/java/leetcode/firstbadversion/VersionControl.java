package leetcode.firstbadversion;

public class VersionControl {
	private int firstBadVersion;
	
	public VersionControl(int firstBadVersion) {
		this.firstBadVersion = firstBadVersion;
	}
	
	protected boolean isBadVersion(int n) {
		if (n >= this.firstBadVersion) {
			return true;
		} else {
			return false;
		}
	}
}

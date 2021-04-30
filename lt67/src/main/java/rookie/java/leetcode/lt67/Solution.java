package rookie.java.leetcode.lt67;

public class Solution {
	public String addBinary(String a, String b) {
		return addBinary(a, b, 0);
    }
	
	private String addBinary(String a, String b, int carry) {
		int da = 0, db = 0;
		int val = 0;
		String valRes = "";
		String res = "";
		if (a.equals("")) {
			if (b.equals("")) {
				val = carry;
				if (carry == 0) {
					valRes = "";
				} else {
					valRes = String.valueOf(val);
				}
			} else {
				db = b.charAt(b.length() - 1) - '0';
				val = (db + carry) % 2;
				carry = (db + carry) / 2;
				res = addBinary("", b.substring(0, b.length() - 1), carry);
				valRes = String.valueOf(val);
			}
		} else {
			if (b.equals("")) {
				da = a.charAt(a.length() - 1) - '0';
				val = (da  + carry) % 2;
				carry = (da + carry) / 2;
				res = addBinary(a.substring(0, a.length() - 1), "", carry);
				valRes = String.valueOf(val);
			} else {
				da = a.charAt(a.length() - 1) - '0';
				db = b.charAt(b.length() - 1) - '0';
				val = (da + db + carry) % 2;
				carry = (da + db + carry) / 2;
				res = addBinary(a.substring(0, a.length() - 1), 
						b.substring(0, b.length() - 1), carry);
				valRes = String.valueOf(val);
			}
		}
		return  res + valRes;
	}
}

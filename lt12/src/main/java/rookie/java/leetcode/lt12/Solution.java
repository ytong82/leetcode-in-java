package rookie.java.leetcode.lt12;

public class Solution {
	public String intToRoman(int num) {
		int[] digits = convertToDigits(num);
		
		String roman = "";
		for (int i=3; i>=0; i--) {
			if (i == 3) {
				for (int j=0; j<digits[i]; j++) {
					roman += "M";
				}
			} else {
				roman = roman + romanSnippet(i, digits[i]);
			}
		}
		
		return roman;
    }
	
	private String romanSnippet(int digits, int num) {
		String res = "";
		if (num == 4) {
			if (digits == 2) {
				res = "CD";
			} else if (digits == 1) {
				res = "XL";
			} else if (digits == 0) {
				res = "IV";
			}
		} else if (num == 9) {
			if (digits == 2) {
				res = "CM";
			} else if (digits == 1) {
				res = "XC";
			} else if (digits == 0) {
				res = "IX";
			}
		} else if (num == 5){
			if (digits == 2) {
				res = "D";
			} else if (digits == 1) {
				res = "L";
			} else if (digits == 0) {
				res = "V";
			}
		} else if (num > 5) {
			if (digits == 2) {
				res = "D";
				for (int i=5; i<num; i++) {
					res += "C";
				}
			} else if (digits == 1) {
				res = "L";
				for (int i=5; i<num; i++) {
					res += "X";
				}
			} else if (digits == 0) {
				res = "V";
				for (int i=5; i<num; i++) {
					res += "I";
				}
			}
		} else if (num < 5) {
			if (digits == 2) {
				for (int i=0; i<num; i++) {
					res += "C";
				}
			} else if (digits == 1) {
				for (int i=0; i<num; i++) {
					res += "X";
				}
			} else if (digits == 0) {
				for (int i=0; i<num; i++) {
					res += "I";
				}
			}
		}
		return res;
	}
	
	private int[] convertToDigits(int num) {
		int[] digits = new int[4];
		for (int i=3; i>=0; i--) {
			digits[i] = num / (int)Math.pow(10, i);
			num = num - digits[i] * (int)Math.pow(10, i);
		}
		return digits;
	}
}

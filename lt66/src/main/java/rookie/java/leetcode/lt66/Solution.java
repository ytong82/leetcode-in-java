package rookie.java.leetcode.lt66;

public class Solution {
	 public int[] plusOne(int[] digits) {
		 int[] tmp = new int[digits.length];
		 int carry = 0;
		 
		 // calculate
		 for (int i=tmp.length-1; i>=0; i--) {
			 if ( i == tmp.length - 1) {
				 if (digits[i] + carry + 1 >= 10) {
					 tmp[i] = digits[i] + carry + 1 - 10;
					 carry = 1;
				 } else {
					 tmp[i] = digits[i] + carry + 1;
					 carry = 0;
				 }
			 } else {
				 if (digits[i] + carry >= 10) {
					 tmp[i] = digits[i] + carry - 10;
					 carry = 1;
				 } else {
					 tmp[i] = digits[i] + carry;
					 carry = 0;
				 }
			 }
		 }
		 
		 // make res
		 if (carry == 0) {
			 return tmp;
		 } else {
			 int[] res = new int[digits.length+1];
			 res[0] = carry;
			 for (int i=1; i<res.length; i++) {
				 res[i] = tmp[i-1];
			 }
			 return res;
		 }
	 }
}

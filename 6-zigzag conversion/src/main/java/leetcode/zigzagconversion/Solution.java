package leetcode.zigzagconversion;

public class Solution {
	public String convert(String s, int numRows) {
		int length = s.length();
		
		if (numRows == 0 || length == 0) {
			return "";
		}
		
		if (numRows == 1) {
			return s;
		}
		
		
		int unit = numRows + numRows - 2;
		int height = numRows;
		int width = this.calculateWidth(length, numRows);
		
		char[][] str = new char[height][width];
		
		int index = 0;
		int i = 0, j = -1;
		while (index < length) {
			if (index % unit == 0) {
				j++;
				for (i=0; i<height && index<length; ++i) {
					str[i][j] = s.charAt(index);
					index++;
				}
				i--;
			} else {
				i--;
				j++;
				str[i][j] = s.charAt(index);
				index++;
			}
		}
		
		char[] res = new char[length];
		index = 0;
		for (i=0; i<height; ++i) {
			for (j=0; j<width; ++j) {
				if (str[i][j] != '\u0000') {
					res[index] = str[i][j];
					index++;
				}
			}
		}
	
		return String.valueOf(res);
    }
	
	private int calculateWidth(int length, int numRows) {
		int unit = numRows + numRows - 2;
		int quotient = length / unit;
		int remain = length % unit;
		
		int add = 0;
		if (remain <= numRows) {
			add = 1;
		} else {
			add = remain - numRows + 1;
		}
		
		return quotient * (1 + numRows - 2) + add;
	}
}

package rookie.java.leetcode.lt13;

public class Solution {
	public int romanToInt(String s) {
		int sum = 0;
		for (int i=0; i<s.length(); i++) {
			if (i <= s.length() - 2) {
				if ((getRomanSub(s.substring(i,i+2)) != -1)) {
					sum += getRomanSub(s.substring(i,i+2));
					i++;
				} else {
					sum += getRoman(s.substring(i,i+1));
				}
			} else {
				sum += getRoman(s.substring(i,i+1));
			}
		}
        return sum;
    }
	
	private int getRomanSub(String s) {
		if (s.equals("IV")) {
			return 4;
		} else if (s.equals("IX")) {
			return 9;
		} else if (s.equals("XL")) {
			return 40;
		} else if (s.equals("XC")) {
			return 90;
		} else if (s.equals("CD")) {
			 return 400;
		} else if (s.equals("CM")) {
			return 900;
		} else {
			return -1;
		}
	}
	
	private int getRoman(String s) {
		if (s.equals("I")) {
			return 1;
		} else if (s.equals("V")) {
			return 5;
		} else if (s.equals("X")) {
			return 10;
		} else if (s.equals("L")) {
			return 50;
		} else if (s.equals("C")) {
			return 100;
		} else if (s.equals("D")) {
			return 500;
		} else if (s.equals("M")) {
			return 1000;
		} 
		return -1;
	}
}

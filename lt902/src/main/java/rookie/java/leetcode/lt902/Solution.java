package rookie.java.leetcode.lt902;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
	public int atMostNGivenDigitSet(String[] digits, int n) {
		List<Integer> dDigits = new ArrayList<Integer>();
		for (String digit : digits) {
			dDigits.add(Integer.parseInt(digit));
		}
		Collections.sort(dDigits);
		
		List<Integer> nDigits = getDigits(n);
		
		int[] pows = new int[nDigits.size()];
		for (int i=0; i < nDigits.size(); i++) {
			pows[i] = (int)Math.pow(dDigits.size(), i);
		}
		
		int[] gaps = getGaps(dDigits, nDigits);
		int sum = 0;
		for (int i=gaps.length-1; i>=0; i--) {
			if (dDigits.contains(nDigits.get(i))) {
				sum += gaps[i] * pows[i];
				if (i == 0) {
					sum++;
				}
			} else {
				sum += gaps[i] * pows[i];
				break;
			}
		}
		
		for (int i=1; i<pows.length; i++) {
			sum += pows[i];
		}
		return sum;
	}

	private int[] getGaps(List<Integer> dDigits, List<Integer> nDigits) {
		int[] gaps = new int[nDigits.size()];
		for (int i=0; i<nDigits.size(); i++) {
			for (int j=0; j<dDigits.size(); j++) {
				if (nDigits.get(i) > dDigits.get(j)) {
					gaps[i] = j+1;
				}
			}
		}
		return gaps;
	}
	
	private List<Integer> getDigits(int n) {
		List<Integer> digits = new ArrayList<Integer>();
		int number = n;
		do {
			digits.add(number % 10);
			number = number / 10;
		} while (number != 0);
		return digits;
	}
}
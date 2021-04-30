package rookie.java.leetcode.lt77;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	private int N;
	private List<List<Integer>> combinations;
	public List<List<Integer>> combine(int n, int k) {
		this.N = n;
		this.combinations = new ArrayList<List<Integer>>();
		combine(1, k, new ArrayList<Integer>());
        return this.combinations;
    }
	
	private void combine(int n, int k, List<Integer> combination) {
		if (n > this.N + 1) {
			return;
		}
		
		if (combination.size() == k) {
			System.out.printf("n=%s, k=%s, combination=%s \n", n, k, combination);
			this.combinations.add(combination);
		} else {
			List<Integer> oldCombination = new ArrayList<Integer>();
			List<Integer> newCombination = new ArrayList<Integer>();
			for (Integer item : combination) {
				oldCombination.add(item);
				newCombination.add(item);
			}
			combine(n+1, k, oldCombination);
			newCombination.add(n);
			combine(n+1, k, newCombination);
		}
	}
}

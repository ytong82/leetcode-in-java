package rookie.java.leetcode.lt40;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
	private List<List<Integer>> reses;
	
	public Solution() {
		this.reses = new ArrayList<List<Integer>>();
	}
	
	public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<Integer> res = new ArrayList<Integer>();
        Arrays.parallelSort(candidates);
        combinationSum2(candidates, target, 0, res);
		return this.reses;
    }
	
	private void combinationSum2(int[] candidates, int target, int index, List<Integer> res) {
		if (target == 0) {
			List<Integer> copyRes = new ArrayList<Integer>(res);
			if (!this.reses.contains(copyRes)) {
				this.reses.add(copyRes);
			}
		}
		
		if (index == candidates.length || target < 0) {
			return;
		}
	
		res.add(candidates[index]);
		combinationSum2(candidates, target - candidates[index], index + 1, res);
		res.remove(res.size() - 1);
		combinationSum2(candidates, target, index + 1, res);
	}
}

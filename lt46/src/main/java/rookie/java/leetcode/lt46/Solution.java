package rookie.java.leetcode.lt46;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> reses = new ArrayList<List<Integer>>();
		int[] preNums = {};
		permute(preNums, nums, reses);
		return reses;
    }
	
	private void permute(int[] preNums, int[] postNums, List<List<Integer>> reses) {
		if (postNums.length == 1) {
			List<Integer> res = new ArrayList<Integer>();
			for (int preNum : preNums) {
				res.add(preNum);
			}
			res.add(postNums[0]);
			reses.add(res);
		} else {
			int[] nextPreNums = new int[preNums.length+1];
			for (int i=0; i<preNums.length; i++) {
				nextPreNums[i] = preNums[i];
			}
			
			for (int i=0; i<postNums.length; i++) {
				int[] nextPostNums = new int[postNums.length-1];
				nextPreNums[preNums.length] = postNums[i];
				for (int j=0, k=0; j<postNums.length && k<nextPostNums.length; j++) {
					if (i != j) {
						nextPostNums[k] = postNums[j];
						k++;
					}
				}
				permute(nextPreNums, nextPostNums, reses);
			}
		}
	}
}
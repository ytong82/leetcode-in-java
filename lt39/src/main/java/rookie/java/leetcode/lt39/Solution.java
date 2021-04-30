package rookie.java.leetcode.lt39;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;

public class Solution {
	public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Set<List<Integer>> uniRes = new HashSet<List<Integer>>();
        Stack<Integer> stack = new Stack<Integer>();
        this.__combinationSum(candidates, target, stack, uniRes);
        
        List<List<Integer>> reses =  new ArrayList<List<Integer>>();
        for (List<Integer> res: uniRes) {
        	reses.add(res);
        }
        return reses;
    }
	
	private void __combinationSum(int[] candidates, int target, Stack<Integer> stack, Set<List<Integer>> uniRes) {
		if (target == 0) {
			List<Integer> res = new ArrayList<Integer>();
			for (int i=0; i<stack.size(); i++) {
				res.add(stack.get(i));
			}
			Collections.sort(res);
			uniRes.add(res);
		} else if (target > 0) {
			for (int i=0; i<candidates.length; i++) {
				stack.push(candidates[i]);
				__combinationSum(candidates, target - candidates[i], stack, uniRes);
				stack.pop();
			}
		} else if (target < 0) {
			return;
		}
	}
}

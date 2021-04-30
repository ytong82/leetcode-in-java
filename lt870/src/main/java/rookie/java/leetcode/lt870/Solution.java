package rookie.java.leetcode.lt870;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class Solution {
	class Assignment {
		int index;
		boolean assigned;
		
		Assignment(int index, boolean assigned) {
			this.index = index;
			this.assigned = assigned;
		}
	}
	
	private int getIndex(Map<Integer, List<Assignment>> indices, int val) {
		List<Assignment> assignments = indices.get(val);
		for (int i=0; i<assignments.size(); i++) {
			if (assignments.get(i).assigned) {
				assignments.get(i).assigned = false;
				return assignments.get(i).index;
			}
		}
		return -1;
	}
	
	public int[] advantageCount(int[] A, int[] B) {
		// res
		int[] res = new int[A.length];
		
		// record indices
		Map<Integer, List<Assignment>> indices = new HashMap<Integer, List<Assignment>>();
		for (int i=0; i<B.length; i++) {
			if (!indices.containsKey(B[i])) {
				indices.put(B[i], new ArrayList<Assignment>());
			} 
			Assignment assignment = new Assignment(i, true);
			indices.get(B[i]).add(assignment);
		}
		
		// sort
		Arrays.parallelSort(A);
		Arrays.parallelSort(B);
		
		// process A[i] > B[i]
		List<Integer> unassigned = new ArrayList<Integer>();
		int j = 0;
		for (int i=0; i<A.length && j<B.length; i++) {
			if (A[i] > B[j]) {
				res[getIndex(indices, B[j])] = A[i];
				j++;
			} else {
				unassigned.add(A[i]);
			}
		}
		
		// process the rest
		for (int i=0; i<unassigned.size() && j<B.length; i++, j++) {
			res[getIndex(indices, B[j])] = unassigned.get(i);
		}
		
		return res;
    }
}

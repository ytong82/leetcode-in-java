package rookie.java.leetcode.lt1640;

import java.util.HashMap;
import java.util.Map;

public class Solution {
	public boolean canFormArray(int[] arr, int[][] pieces) {
		// build up the map
		Map<Integer, Integer> piecesMap = new HashMap<Integer, Integer>(); 
		for (int i=0; i<pieces.length; i++) {
			piecesMap.put(pieces[i][0], i);
		}
		
		// check
		for (int i=0; i<arr.length;) {
			if (piecesMap.containsKey(arr[i])) {
				int j = piecesMap.get(arr[i]);
				for (int k=0; k<pieces[j].length; k++) {
					if (arr[i+k] != pieces[j][k]) {
						return false;
					}
				}
				i += pieces[j].length;
			} else {
				return false;
			}
			
		}
		
        return true;
    }
}

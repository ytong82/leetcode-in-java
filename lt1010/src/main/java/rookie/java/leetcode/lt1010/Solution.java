package rookie.java.leetcode.lt1010;

import java.util.HashMap;
import java.util.Map;

public class Solution {
	public int numPairsDivisibleBy60(int[] time) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i=0; i<time.length; i++) {
			int key = time[i] % 60;
			if (map.containsKey(key)) {
				map.put(key, map.get(key) + 1);
			} else {
				map.put(key, 1);
			}
		}
		
		int count = 0;
		for (Integer key : map.keySet()) {
			int anotherKey = (60 - key) % 60;
			if (map.containsKey(anotherKey)) {
				if (anotherKey == key) {
					count += map.get(key) * (map.get(key) - 1);
				} else {
					count += map.get(anotherKey) * map.get(key);
				}
			}
		}	
        return count / 2;
    }
}

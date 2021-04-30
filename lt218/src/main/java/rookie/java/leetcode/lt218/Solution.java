package rookie.java.leetcode.lt218;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class Solution {
	public List<List<Integer>> getSkyline(int[][] buildings) {
		List<List<Integer>> points = new ArrayList<List<Integer>>();
		if (buildings == null || buildings.length == 0 || buildings[0].length == 0) {
			return points;
		}
		
		// process buildings
		List<Height> heights = new ArrayList<Height>();
		for (int[] building : buildings) {
			heights.add(new Height(building[0], -building[2]));
			heights.add(new Height(building[1], building[2]));
		}
		
		// sort
		Collections.sort(heights, new Comparator<Height>() {
			public int compare(Height h1, Height h2) {
				return h1.index != h2.index? h1.index - h2.index : h1.height - h2.height;
			}
		});
		
		// run heap
		PriorityQueue<Integer> heap = new PriorityQueue<Integer>(10000, Collections.reverseOrder());
		heap.offer(0);
		int prev = 0;
		for (Height height : heights) {
			if (height.height < 0) {
				heap.offer(-height.height);
			} else {
				heap.remove(height.height);
			}
			
			int curr = heap.peek();
			if (curr != prev) {
				List<Integer> point = new ArrayList<Integer>();
				point.add(height.index);
				point.add(curr);
				points.add(point);
				prev = curr;
			}
		}
		
		return points;
    }
	
	class Height {
		int index;
		int height;
		Height(int index, int height) {
			this.index = index;
			this.height = height;
		}
	}
}

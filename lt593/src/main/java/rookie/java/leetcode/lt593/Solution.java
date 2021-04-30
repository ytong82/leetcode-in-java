package rookie.java.leetcode.lt593;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Solution {
	public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
		List<Double> distances = new LinkedList<Double>();
		distances.add(this.calculateDistance(p1, p2));
		distances.add(this.calculateDistance(p1, p3));
		distances.add(this.calculateDistance(p1, p4));
		distances.add(this.calculateDistance(p2, p3));
		distances.add(this.calculateDistance(p2, p4));
		distances.add(this.calculateDistance(p3, p4));
		
		Collections.sort(distances);
		//System.out.println(distances);
		if (distances.get(0).equals(0.0)) {
			return false;
		}
		for (int i=0; i<distances.size(); i++) {
			if (i < 4) {
				if (!distances.get(i).equals(distances.get(0))) {
					return false;
				}
			} else {
				if (!distances.get(i).equals(distances.get(5))) {
					return false;
				}
			}
		}
        return true;
    }
	
	private double calculateDistance(int[] p1, int[] p2) {
		double distance = Math.sqrt((p2[0] - p1[0]) * (p2[0] - p1[0]) 
				+ (p2[1] - p1[1]) * (p2[1] - p1[1]));
		return distance;
	}
}

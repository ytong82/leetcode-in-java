package rookie.java.leetcode.lt735;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Solution {
	public int[] asteroidCollision(int[] asteroids) {
		List<Integer> afterCollision = new LinkedList<Integer>();	
		for (int i=0; i<asteroids.length; i++) {
			addAsteroid(afterCollision, asteroids[i]);
		}
		
		int[] res = new int[afterCollision.size()];
		for (int i=0; i<res.length; i++) {
			res[i] = afterCollision.get(i);
		}
		
		return res;
    }
	
	private void addAsteroid(List<Integer> afterCollision, int asteroid) {
		if (asteroid < 0) {
			ListIterator<Integer> iter = afterCollision.listIterator();
			while (iter.hasNext()) {
				iter.next();
			}
			while (iter.hasPrevious()) {
				int item = iter.previous();
				if (item >= 0) {
					if (item < Math.abs(asteroid)) {
						iter.remove();
					} else if (item == Math.abs(asteroid)) {
						iter.remove();
						return;
					} else {
						return;
					}
				}
			}
			afterCollision.add(asteroid);
		} else {
			afterCollision.add(asteroid);
		}
	}
}

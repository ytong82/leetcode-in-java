package rookie.java.leetcode.lt933;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class RecentCounter {
	private List<Integer> pings;
	
	public RecentCounter() {
		this.pings = new LinkedList<Integer>();
	}
	
	public int ping(int t) {
		pings.add(t);
		
		Iterator<Integer> iterator = pings.iterator();
		while (iterator.hasNext()) {
			int ping = iterator.next();
			if (ping < t - 3000) {
				iterator.remove();
			}
		}
	
		return pings.size();
	}
}

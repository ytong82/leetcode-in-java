package rookie.java.leetcode.lt1306;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
	public boolean canReach(int[] arr, int start) {
		boolean dp[] = new boolean[arr.length];
		dp[start] = true;
		
		int index = start;
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.offer(index);
		while (queue.size() > 0) {
			index = queue.poll();
			if (arr[index] == 0) {
				return true;
			}
			int next = index + arr[index];
			if (next >= 0 && next < arr.length && dp[next] == false) {
				dp[next] = true;
				queue.offer(next);
			}
			next = index - arr[index];
			if (next >= 0 && next < arr.length && dp[next] == false) {
				dp[next] = true;
				queue.offer(next);
			}
		}
		return false;
    }
}

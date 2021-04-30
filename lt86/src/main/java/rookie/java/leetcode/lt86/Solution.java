package rookie.java.leetcode.lt86;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public ListNode partition(ListNode head, int x) {
		List<Integer> left = new ArrayList<Integer>();
		List<Integer> right = new ArrayList<Integer>();
		
		ListNode curr = head;
		while (curr != null) {
			if (curr.val < x) {
				left.add(curr.val);
			} else {
				right.add(curr.val);
			}
			curr = curr.next;
		}
		
		left.addAll(right);
		int index = 0;
		curr = head;
		while (curr != null) {
			curr.val = left.get(index);
			curr = curr.next;
			index++;
		}
		
		return head;
    }
}

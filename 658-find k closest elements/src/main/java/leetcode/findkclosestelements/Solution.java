package leetcode.findkclosestelements;

import java.util.LinkedList;
import java.util.List;

public class Solution {
	public List<Integer> findClosestElements(int[] arr, int k, int x) {
		int index= this.doBinarySearch(arr, x, 0, arr.length - 1);
		return this.getClosestElements(arr, k, x, index);
    }
	
	private int doBinarySearch(int[] arr, int x, int left, int right) {
		while (left <= right) {
			int middle = left + (right - left) / 2;
			if (x == arr[middle]) {
				return middle;
			} else if (middle > 0 && x < arr[middle] && x > arr[middle-1]){
				return middle;
			} else if (middle == 0 && x < arr[middle]) {
				return middle;
			} else if (x < arr[middle]) {
				right = middle - 1;
				this.doBinarySearch(arr, x, left, right);
			} else {
				left = middle + 1;
				this.doBinarySearch(arr, x, left, right);
			}
		}
		
		if (left == arr.length) {
			return arr.length;
		} else {
			return -1;
		}
	}
	
	private List<Integer> getClosestElements(int[] arr, int k, int x, int index) {
		List<Integer> closestElements = new LinkedList<Integer>();
		
		int left = index - 1;
		int right = index;
		int count = 0;
			
		while (left >= 0 && right < arr.length && count < k) {
			if (arr[right] - x < x - arr[left]) {
				right++;	
			} else {
				left--;
			}
			count++;
		}
				
		if (left < 0) {
			right = right + (k - count);
		} else if (right >= arr.length) {
			left = left - (k - count);
		}
		
		for (int i=left+1; i<right; ++i) {
			closestElements.add(arr[i]);
		}
		
		return closestElements;
	}
}

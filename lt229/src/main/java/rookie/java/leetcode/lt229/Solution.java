package rookie.java.leetcode.lt229;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public List<Integer> majorityElement(int[] nums) {
        int num = 0, num2 = 0;
        int count = 0, count2 = 0;
        
        // loop one to find 
        for (int i=0; i<nums.length; i++) {
        	if (nums[i] == num) {
        		count++;
        	} else if (nums[i] == num2) {
        		count2++;
        	} else if (count == 0) {
        		count++;
        		num = nums[i];
        	} else if (count2 == 0) {
        		count2++;
        		num2 = nums[i];
        	} else {
        		count--;
        		count2--;
        	}
        }
        
        // loop two to verify
        count = 0;
        count2 = 0;
        for (int i=0; i<nums.length; i++) {
        	if (nums[i] == num) {
        		count++;
        	} else if (nums[i] == num2) {
        		count2++;
        	}
        }
        
        // res
        List<Integer> res = new ArrayList<Integer>();
        if (count > nums.length / 3) {
        	res.add(num);
        }
        if (count2 > nums.length / 3) {
        	res.add(num2);
        }
        return res;
    }
}

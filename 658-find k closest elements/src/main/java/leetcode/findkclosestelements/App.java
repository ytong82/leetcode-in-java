package leetcode.findkclosestelements;

import java.util.Arrays;
import java.util.List;

public class App 
{
    public static void main( String[] args )
    {
    	/*
    	int[] arr = {1, 2, 3, 4, 5};
    	int k = 4;
    	int x = 3;
    	*/
    	
    	int[] arr = {1, 1, 1, 10, 10, 10};
    	int k = 1;
    	int x = 9;
    	
    	Solution solution = new Solution();
    	List<Integer> closestElements = solution.findClosestElements(arr, k, x);
    	
    	System.out.println(Arrays.toString(closestElements.toArray()));
    }
}

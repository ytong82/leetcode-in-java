package leetcode.mergesortedarray;

import java.util.Arrays;

public class App 
{
    public static void main( String[] args )
    {
        int[] nums1 = {1, 2, 3, 0, 0 ,0};
        int[] nums2 = {2, 5, 6};
        int m = 3;
        int n = 3;
        
    	/*int[] nums1 = {2, 0};
    	int m = 1;
    	int[] nums2 = {1};
    	int n = 1;*/
    	
        Solution solution = new Solution();
        solution.merge(nums1, m, nums2, n);
        
        System.out.println(Arrays.toString(nums1));
    }
}

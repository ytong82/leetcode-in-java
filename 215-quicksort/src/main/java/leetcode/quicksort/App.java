package leetcode.quicksort;

public class App 
{
    public static void main( String[] args )
    {
        //int[] nums = {3, 2, 1, 5, 6, 4};
        //int k = 2;
        
    	int[] nums = {3, 2, 3, 1, 2, 4, 5, 5, 6};
    	int k = 4;
    	
        Solution solution = new Solution();
        int kthLargest = solution.findKthLargest(nums, k);
        
        System.out.printf("The kth largest element is %d.", kthLargest);
    }
}

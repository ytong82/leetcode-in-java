package leetcode.findpeakelement;

public class App 
{
    public static void main( String[] args )
    {
        //int[] nums = {1, 2, 3, 1};
        int[] nums = {1, 2, 1, 3, 5, 6, 4}; 
    	
        Solution solution = new Solution();
        System.out.printf("Find peak element on index %d.", solution.findPeakElement(nums));
    }
}

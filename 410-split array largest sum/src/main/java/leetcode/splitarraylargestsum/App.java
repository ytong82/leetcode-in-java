package leetcode.splitarraylargestsum;

public class App 
{
    public static void main( String[] args )
    {
        int[] nums = {7, 2, 5, 10, 8};
        int m = 2;
        
        Solution solution = new Solution();
        int res = solution.splitArray(nums, m);
        
        System.out.println(res);
    }
}

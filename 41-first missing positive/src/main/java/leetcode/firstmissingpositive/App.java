package leetcode.firstmissingpositive;

public class App 
{
    public static void main( String[] args )
    {
        int[] nums = {3, 4, -1, 1};
        
        Solution solution = new Solution();
        System.out.println(solution.firstMissingPositive(nums));
    }
}

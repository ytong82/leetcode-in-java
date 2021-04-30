package rookie.java.leetcode.lt16;

public class App {
    public static void main( String[] args ) {
        Solution solution = new Solution();
    	int[] nums = {-1,2,1,-4};
    	int target = 1;
        System.out.println(solution.threeSumClosest(nums, target));
    }
}

package rookie.java.leetcode.lt81;

public class App {
    public static void main( String[] args ) {
        Solution solution = new Solution();
    	int[] nums = {2,5,6,0,0,1,2};
        //int[] nums = {0,0,1,0,0,0,0,0};
        System.out.println(solution.search(nums, 0));
        System.out.println(solution.search(nums, 3));
    }
}

package rookie.java.leetcode.lt738;

public class App {
    public static void main( String[] args ) {
        Solution solution = new Solution();
        int[] nums = {120, 22323, 332, 20, 10, 1234, 101};
        for (int num : nums) {
        	System.out.println(solution.monotoneIncreasingDigits(num));
        }
    }
}

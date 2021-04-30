package rookie.java.leetcode.lt12;

public class App {
    public static void main( String[] args ) {
        Solution solution = new Solution();
    	int[] nums = {3, 4, 9, 58, 1994};
    	for (Integer num : nums) {
    		System.out.println(solution.intToRoman(num));
    	}
    }
}

package rookie.java.leetcode.lt26;

public class App {
    public static void main( String[] args ) {
        Solution solution = new Solution();
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int len = solution.removeDuplicates(nums);
        System.out.print("[");
        for (int i=0; i<len; i++) {
        	if (i == len - 1) {
        		System.out.printf("%s", nums[i]);
        	} else {
        		System.out.printf("%s,", nums[i]);
        	}
        }
        System.out.print("]");
    }
}

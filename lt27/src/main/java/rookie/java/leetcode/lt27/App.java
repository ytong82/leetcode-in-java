package rookie.java.leetcode.lt27;

public class App {
    public static void main( String[] args ) {
        int[][] numses = {{3,2,2,3},{0,1,2,2,3,0,4,2},{1},{4,5}};
        int[] vals = {3,2,1,5};
    	Solution solution = new Solution();
    	for (int i=0; i<numses.length; i++) {
    		int length = solution.removeElement(numses[i], vals[i]);
    		print(numses[i], length);
    	}
    }
    
    private static void print(int[] nums, int length) {
    	for (int i=0; i<length; i++) {
    		System.out.printf("%s,", nums[i]);
    	}
    	System.out.println();
    }
}

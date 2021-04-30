package rookie.java.leetcode.lt229;

public class App {
    public static void main( String[] args ) {
        Solution solution = new Solution();
        int[][] numses = {{3,2,3}, {1}, {1,2}, {1,2,2,3,2,1,1,3}};
        for (int i=0; i<numses.length; i++) {
        	if (i == 3) {
        		System.out.println(solution.majorityElement(numses[i]));
        	}
        }
    }
}

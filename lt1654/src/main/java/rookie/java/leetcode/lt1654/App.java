package rookie.java.leetcode.lt1654;

public class App {
    public static void main( String[] args ) {
    	Solution solution = new Solution();
    	int[][] forbidden = {{8,3,16,6,12,20}, {14,4,18,1,15}, {8,3,16,6,12,20}, {1,6,2,14,5,17,4}, {128,178,147,165,63,11,150,20,158,144,136}};
    	int[] as = {15,3,15,16,61};
    	int[] bs = {13,15,13,9,170};
    	int[] xs = {11,9,11,7,135};
    	for (int i=0; i<forbidden.length; i++) {
    		if (i == 0) {
    			System.out.println(solution.minimumJumps(forbidden[i], as[i], bs[i], xs[i]));
    		}
    	}
    }
}

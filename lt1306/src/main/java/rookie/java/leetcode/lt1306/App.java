package rookie.java.leetcode.lt1306;

public class App {
    public static void main( String[] args ) {
        Solution solution = new Solution();
        int[][] arrs = {{4,2,3,0,3,1,2},{4,2,3,0,3,1,2},{3,0,2,1,2},
        		{58,48,64,36,19,19,67,13,32,2,59,50,29,68,50,0,69,31,54,20,22,43,30,9,68,71,20,22,48,74,2,65,27,54,30,5,66,24,64,68,9,31,50,59,15,72,6,49,11,71,12,61,5,66,30,1,2,39,59,35,53,21,76,17,71,40,68,57,64,53,70,21,50,49,25,63,35}};
        int[] starts = {5,0,2,46};
        for (int i=0; i<arrs.length; i++) {
        	if (i == 3) {
        		System.out.println(solution.canReach(arrs[i], starts[i]));
        	}
        }
    }
}
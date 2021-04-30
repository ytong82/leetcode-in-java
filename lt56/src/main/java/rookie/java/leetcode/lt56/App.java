package rookie.java.leetcode.lt56;

public class App {
    public static void main( String[] args ) {
        Solution solution = new Solution();
    	//int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        //int[][] intervals = {{1,4},{4,5}};
        int[][] intervals = {{1,4},{0,0}};
        
        int[][] res = solution.merge(intervals);
        
        System.out.print("[");
        for (int i=0; i<res.length; i++) {
        	System.out.print("[");
        	for (int j=0; j<res[i].length; j++) {
        		System.out.printf("%s,", res[i][j]);
        	}
        	System.out.print("]");
        }
        System.out.print("]");
    }
}

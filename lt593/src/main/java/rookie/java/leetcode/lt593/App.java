package rookie.java.leetcode.lt593;

public class App {
    public static void main( String[] args ) {
    	Solution solution = new Solution();
    	int[] p1 = {0,0};
    	int[] p2 = {1,1};
    	int[] p3 = {1,0};
    	int[] p4 = {0,1};
    	
    	System.out.println(solution.validSquare(p1, p2, p3, p4));
    }
}

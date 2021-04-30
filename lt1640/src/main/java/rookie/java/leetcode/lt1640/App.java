package rookie.java.leetcode.lt1640;

public class App {
    public static void main( String[] args ) {
        Solution solution = new Solution();
    	int[][] arrs = {{85}, {15,88}, {49,18,16}, {91,4,64,78}, {1,3,5,7}, {85,1,2}};
        int[][][] pieceses = {{{85}}, {{88},{15}}, {{16,18,49}}, {{78},{4,64},{91}}, {{2,4,6,8}}, {{85,2,1}}};
        for (int i=0; i<arrs.length; i++) {
        	System.out.println(solution.canFormArray(arrs[i], pieceses[i]));
        }
    }
}

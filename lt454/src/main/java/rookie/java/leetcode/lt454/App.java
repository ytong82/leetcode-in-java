package rookie.java.leetcode.lt454;

public class App {
    public static void main( String[] args ) {
        Solution solution = new Solution();
        //int[] A = {1,2};
        //int[] B = {-2,-1};
        //int[] C = {-1,2};
        //int[] D = {0,2};
        int[] A = {-1,-1};
        int[] B = {-1,1};
        int[] C = {-1,1};
        int[] D = {1,-1};
        System.out.println(solution.fourSumCount(A, B, C, D));
    }
}

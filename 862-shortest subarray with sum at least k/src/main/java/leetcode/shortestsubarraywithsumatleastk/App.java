package leetcode.shortestsubarraywithsumatleastk;

public class App 
{
    public static void main( String[] args )
    {
        int[] A = {-28, 81, -20, 28, 29};
        int K = 89;
        
        Solution solution = new Solution();
        int res = solution.shortestSubarray(A, K);
        System.out.println(res);
    }
}

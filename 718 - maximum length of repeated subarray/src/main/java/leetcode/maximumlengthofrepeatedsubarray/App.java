package leetcode.maximumlengthofrepeatedsubarray;

public class App 
{
    public static void main( String[] args )
    {
        int[] A = {1, 2, 3, 2, 1};
        int[] B = {3, 2, 1, 4, 7};
        
        Solution solution = new Solution();
        int res = solution.findLength(A, B);
        
        System.out.println(res);
    }
}

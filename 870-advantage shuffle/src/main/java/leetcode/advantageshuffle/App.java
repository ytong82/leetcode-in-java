package leetcode.advantageshuffle;

import java.util.Arrays;

public class App 
{
    public static void main( String[] args )
    {        
        int[] A = {12, 24, 8, 32};
        int[] B = {13, 25, 32, 11};
        
    	Solution solution = new Solution();
        int[] res = solution.advantageCount(A, B);
        System.out.println(Arrays.toString(res));
    }
}

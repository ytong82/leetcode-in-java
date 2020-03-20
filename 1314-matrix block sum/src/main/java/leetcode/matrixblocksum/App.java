package leetcode.matrixblocksum;

import java.util.Arrays;

public class App 
{
    public static void main( String[] args )
    {
        /*
        int[][] mat = {
        		{1, 2, 3},
        		{4, 5, 6},
        		{7, 8, 9},
        };
        int k = 1;
        
        int[][] mat = {
        		{67, 64, 78},
        		{99, 98, 38},
        		{82, 46, 46},
        		{6, 52, 55},
        		{55, 99, 45},
        };
        int k = 3;
        */
    	
    	int[][] mat = {
    			{76, 4, 73},
    			{21, 8, 56},
    			{4, 56, 61},
    			{70, 32, 38},
    			{31, 94, 67},
    	};
    	int k = 1;
        
        // solution
        Solution solution = new Solution();
        int[][] res = solution.matrixBlockSum(mat, k);
        
        System.out.println("[");
        for (int i=0; i<res.length; ++i) {
        	System.out.println(Arrays.toString(res[i]));
        }
        System.out.print("]");
    }
}

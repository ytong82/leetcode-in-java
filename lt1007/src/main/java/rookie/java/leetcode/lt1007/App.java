package rookie.java.leetcode.lt1007;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //int[] A = {2,1,2,4,2,2};
        //int[] B = {5,2,6,2,3,2};
        
      	//int[] A = {3,5,1,2,3};
    	//int[] B = {3,6,3,3,4};
    	
    	//int[] A = {1,2,1,1,1,2,2,2};
    	//int[] B = {2,1,2,2,2,2,2,2};
    	
    	int[] A = {2,3,2,1,1,1,2,2};
    	int[] B = {2,1,2,1,1,3,1,1};
    	
        Solution solution = new Solution();
        System.out.println(solution.minDominoRotations(A, B));
    }
}

package rookie.java.leetcode.lt11;

public class App 
{
    public static void main( String[] args ) {
        Solution solution = new Solution();
    	//int[] height = {1,8,6,2,5,4,8,3,7};
        //int[] height = {1,1};
        //int[] height = {4,3,2,1,4};
        //int[] height = {1,2,1};
        int[] height = {2,3,4,5,18,17,6};
        System.out.println(solution.maxArea(height));
    }
}

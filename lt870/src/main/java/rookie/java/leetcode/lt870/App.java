package rookie.java.leetcode.lt870;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        Solution solution = new Solution();
        //int[] A = {2,7,11,15};
        //int[] B = {1,10,4,11};
        //int[] A = {12,24,8,32};
        //int[] B = {13,25,32,11};
        //int[] A = {8,9,9,12};
        //int[] B = {6,10,10,10};
        int[] A = {2,0,4,1,2};
        int[] B = {1,3,0,0,2};
        
        int[] res = solution.advantageCount(A, B);
        System.out.println(Arrays.toString(res));
    }
}

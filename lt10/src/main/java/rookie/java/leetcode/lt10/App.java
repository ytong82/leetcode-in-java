package rookie.java.leetcode.lt10;

import rookie.java.leetcode.lt10.iterative.Solution;

public class App {
    public static void main( String[] args ) {
        Solution solution = new Solution();
        String[] ss = {"aa", "aa", "ab", "aab", "mississippi", "mississippi"};
        String[] ps = {"a", "a*", ".*", "c*a*b", "mis*is*p*.", "mis*is*ip*."};
        
        for (int i=0; i<ss.length; i++) {
        	System.out.println(solution.isMatch(ss[i], ps[i]));
        }
    }
}

package rookie.java.leetcode.lt394;

import rookie.java.leetcode.lt394.recursive.Solution;

public class App {
    public static void main( String[] args ) {
        Solution solution = new Solution();
        String[] ss = {"3[a]2[bc]", "3[a2[c]]", "2[abc]3[cd]ef", "abc3[cd]xyz"};
        for (String s : ss) {
        	System.out.println(s);
        	System.out.println(solution.decodeString(s));
        }
    }
}
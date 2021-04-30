package rookie.java.leetcode.lt32;

public class App {
    public static void main( String[] args ) {
    	Solution solution = new Solution();
    	String[] strs = {"(()", ")()())", "(()())","())", "()(())"};
    	for (String str : strs) {
    		System.out.println(solution.longestValidParentheses(str));
    	}
    }
}

package rookie.java.leetcode.lt28;

public class App {
    public static void main( String[] args ) {
    	Solution solution = new Solution();
        System.out.println(solution.strStr("hello", "ll"));
        System.out.println(solution.strStr("helello", "ll"));
        System.out.println(solution.strStr("aaaaa", "bba"));
        System.out.println(solution.strStr("aaa", "aaaa"));
        System.out.println(solution.strStr("a", "a"));
        System.out.println(solution.strStr("", "bba"));
        System.out.println(solution.strStr("", ""));
    	System.out.println(solution.strStr("mississippi", "issip"));
    }
}

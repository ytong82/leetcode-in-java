package rookie.java.leetcode.lt132;

public class App {
    public static void main( String[] args ) {
        Solution solution = new Solution();
        String[] ss = {"aab", "a", "ab"};
        for (String s : ss) {
        	System.out.println(solution.minCut(s));
        }
    }
}

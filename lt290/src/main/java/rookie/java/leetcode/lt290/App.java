package rookie.java.leetcode.lt290;

public class App {
    public static void main( String[] args ) {
        Solution solution = new Solution();
        String pattern = "abba";
        String s = "dog dog dog dog";
        System.out.println(solution.wordPattern(pattern, s));
    }
}

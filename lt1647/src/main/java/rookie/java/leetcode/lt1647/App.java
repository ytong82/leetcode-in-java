package rookie.java.leetcode.lt1647;

public class App {
    public static void main( String[] args ) {
        Solution solution = new Solution();
        String s = "aab";
        //String s = "aaabbbcc";
        //String s = "ceabaacb";
        //String s = "bbcebab";
        System.out.println(solution.minDeletions(s));
    }
}

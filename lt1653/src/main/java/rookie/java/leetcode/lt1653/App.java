package rookie.java.leetcode.lt1653;

public class App {
    public static void main( String[] args ) {
        Solution solution = new Solution();
        //String[] ss = {"aababbab", "bbaaaaabb", "aaaaaaaaaaaaaaaaaaaaaa", "", "bbbbbbbbbbbb"};
        String[] ss = {"aabbbbaabababbbbaaaaaabbababaaabaabaabbbabbbbabbabbababaabaababbbbaaaaabbabbabaaaabbbabaaaabbaaabbbaabbaaaaabaa"};
        for (String s : ss) {
        	System.out.println(solution.minimumDeletions(s));
        }
    }
}

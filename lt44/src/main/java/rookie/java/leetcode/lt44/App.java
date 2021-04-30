package rookie.java.leetcode.lt44;

public class App {
    public static void main( String[] args ) {
        Solution solution = new Solution();
        String[] ss = {"aa", "aa", "cb", "adceb", "acdcb"};
        String[] pp = {"a", "*", "?a", "*a*b", "a*c?b"};
        
        for (int i=0; i<ss.length; i++) {
        	System.out.println(solution.isMatch(ss[i], pp[i]));
        }
    }
}

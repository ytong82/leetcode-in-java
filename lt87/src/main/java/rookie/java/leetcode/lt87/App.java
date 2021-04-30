package rookie.java.leetcode.lt87;

public class App {
    public static void main( String[] args ) {
        Solution solution = new Solution();
        String[] s1es = {"great", "abcde", "a"};
        String[] s2es = {"rgeat", "caebd", "a"};
        for (int i=0; i<s1es.length; i++) {
        	System.out.println(solution.isScramble(s1es[i], s2es[i]));
        }
    }
}

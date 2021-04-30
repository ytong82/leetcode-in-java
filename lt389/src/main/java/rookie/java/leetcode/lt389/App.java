package rookie.java.leetcode.lt389;

public class App {
    public static void main( String[] args ) {
        Solution solution = new Solution();
    	String[] ss = {"abcd", "", "a", "ae"};
        String[] ts = {"abcde", "y", "aa", "aea"};
        for (int i=0; i<ss.length; i++) {
        	System.out.println(solution.findTheDifference(ss[i], ts[i]));
        }
    }
}

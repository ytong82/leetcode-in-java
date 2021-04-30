package rookie.java.leetcode.lt65;

public class App {
    public static void main( String[] args ) {
        Solution solution = new Solution();
        //String[] strs = {"0", " 0.1", "abc", "1 a", "2e10", " -90e3", 
        //		" 1e", "e3", "6e-1", "99e2.5", "53.5e93", " --6", "-+3", "95a54e53"};
        String[] strs = {"84656e656D"};
        for (String str : strs) {
        	System.out.println(solution.isNumber(str));
        }
    }
}

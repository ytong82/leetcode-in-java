package rookie.java.leetcode.lt20;

public class App {
    public static void main( String[] args ) {
        String[] strings = {"()", "()[]{}", "(]", "([)]", "{[]}", "[", "]"};
        Solution solution = new Solution();
        for (String string : strings) {
        	System.out.println(solution.isValid(string));
        }
    }
}

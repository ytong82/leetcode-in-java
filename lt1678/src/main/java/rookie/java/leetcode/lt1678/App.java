package rookie.java.leetcode.lt1678;

public class App {
    public static void main( String[] args ) {
        Solution solution = new Solution();
    	String[] commands = {"G()(al)", "G()()()()(al)", "(al)G(al)()()G"};
        for (String command : commands) {
        	System.out.println(solution.interpret(command));
        }
    }
}

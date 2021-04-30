package rookie.java.leetcode.lt150;

public class App {
    public static void main( String[] args ) {
        Solution solution = new Solution();
    	String[][] tokenses = {{"2", "1", "+", "3", "*"},
    			{"4", "13", "5", "/", "+"},
    			{"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"}
    	};
    	for (String[] tokens : tokenses) {
    		System.out.println(solution.evalRPN(tokens));
    	}
    }
}

package rookie.java.leetcode.lt1689;

public class App {
    public static void main( String[] args ) {
    	Solution solution = new Solution();
        String[] ns = {"32", "82734", "27346209830709182346"};
        for (String n : ns) {
        	System.out.println(solution.minPartitions(n));
        }
    }
}

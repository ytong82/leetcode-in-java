package rookie.java.leetcode.lt754;

public class App {
    public static void main( String[] args ) {
        Solution solution = new Solution();
        int[] targets = {4, 3, 2, -1};
        for (int target : targets) {
        	System.out.println(solution.reachNumber(target));
        }
    }
}

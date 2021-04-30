package rookie.java.leetcode.lt1492;

public class App {
    public static void main( String[] args ) {
    	Solution solution = new Solution();
        System.out.println(solution.kthFactor(12, 3));
        System.out.println(solution.kthFactor(12, 6));
        System.out.println(solution.kthFactor(7, 2));
        System.out.println(solution.kthFactor(4, 4));
        System.out.println(solution.kthFactor(1, 1));
        System.out.println(solution.kthFactor(1000, 3));
    }
}

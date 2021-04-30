package rookie.java.leetcode.lt1000;

public class App {
    public static void main( String[] args ) {
        Solution solution = new Solution();
        int[] stones = {44,99,19,38,74,24,73,25,99,70,77,77,53};
        int K = 11;
        System.out.println(solution.mergeStones(stones, K));
    }
}

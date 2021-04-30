package rookie.java.leetcode.lt125;

public class App {
    public static void main( String[] args ) {
        String[] ss = {"A man, a plan, a canal: Panama", "race a car"};
        Solution solution = new Solution();
        for (String s : ss) {
        	System.out.println(solution.isPalindrome(s));
        }
    }
}

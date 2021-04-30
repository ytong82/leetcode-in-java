package rookie.java.leetcode.lt1328;

public class App {
    public static void main( String[] args ) {
        Solution solution = new Solution();
        String[] palindromes = {"abccba", "aba"};
        for (String palindrome : palindromes) {
        	System.out.println(solution.breakPalindrome(palindrome));
        }
    }
}
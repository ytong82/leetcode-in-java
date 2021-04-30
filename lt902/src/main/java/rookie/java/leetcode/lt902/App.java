package rookie.java.leetcode.lt902;

public class App {
    public static void main( String[] args ) {
        Solution solution = new Solution();
        String[][] digits = {{"1","3","5","7"}, {"1","4","9"}, {"7"}, 
        		{"3","4","8"}, {"5", "6"}, {"5","7","9"}};
        Integer[] ns = {100, 1000000000, 8, 4, 19, 59};
        
        for (int i=0; i<ns.length; i++) {
        	System.out.println(solution.atMostNGivenDigitSet(digits[i], ns[i]));
        }
        
        String[] digit = {"3","4","5","6"};
        int n = 64;
        System.out.println(solution.atMostNGivenDigitSet(digit, n));
    }
}
package rookie.java.leetcode.lt13;

public class App {
    public static void main( String[] args ) {
        Solution solution = new Solution();
        String[] ss = {"IV", "IX", "LVIII", "MCMXCIV"};
        for (String s : ss) {
        	System.out.println(solution.romanToInt(s));
        }
    }
}

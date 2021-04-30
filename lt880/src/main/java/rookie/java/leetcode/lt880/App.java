package rookie.java.leetcode.lt880;

public class App {
    public static void main( String[] args ) {
        Solution solution = new Solution();
        String[] ss = {"leet2code3", "ha22", "a2345678999999999999999", "ixm5xmgo78", "a23"};
        int[] ks= {10, 5, 1, 711, 6};
        for (int i=0; i < ss.length; i++) {
        	System.out.println(solution.decodeAtIndex(ss[i], ks[i]));
        }
    }
}

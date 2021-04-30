package rookie.java.leetcode.lt72;

public class App {
    public static void main( String[] args ) {
        Solution solution = new Solution();
        String[] words1 = {"abbc", "horse", "intention"};
        String[] words2 = {"acc", "ros", "execution"};
        
        for (int i=0; i<words1.length; i++) {
        	System.out.println(solution.minDistance(words1[i], words2[i]));
        }
     }
}

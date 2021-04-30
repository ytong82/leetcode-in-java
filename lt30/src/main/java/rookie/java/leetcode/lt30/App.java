package rookie.java.leetcode.lt30;

public class App {
    public static void main( String[] args ) {
        Solution solution = new Solution();
        
        //String s = "barfoothefoobarman";
        //String[] words = {"foo","bar"};
        //String s = "wordgoodgoodgoodbestword";
        //String[] words = {"word","good","best","word"};
        //String s = "barfoofoobarthefoobarman";
        //String[] words = {"bar","foo","the"};
        String s = "wordgoodgoodgoodbestword";
        String[] words = {"word","good","best","good"};
        
        System.out.println(solution.findSubstring(s, words));
    }
}

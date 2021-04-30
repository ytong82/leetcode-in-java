package rookie.java.leetcode.lt68;

import java.util.List;

public class App {
    public static void main( String[] args ) {
        //String[] words = {"This", "is", "an", "example", "of", "text", "justification."};
        //int maxWidth = 16;
        //String[] words = {"What","must","be","acknowledgment","shall","be"};
        //int maxWidth = 16;
    	String[] words = {"Science","is","what","we","understand","well","enough","to","explain","to","a","computer.","Art","is","everything","else","we","do"};
    	int maxWidth = 20;
    	Solution solution = new Solution();
        List<String> res = solution.fullJustify(words, maxWidth);
        for (String row : res) {
        	System.out.println(row);
        }
    }
}

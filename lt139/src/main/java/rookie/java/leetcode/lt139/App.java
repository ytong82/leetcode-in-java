package rookie.java.leetcode.lt139;

import java.util.ArrayList;
import java.util.List;

public class App 
{
    public static void main( String[] args )
    {
        String s = "catsandog";
        List<String> wordDict = new ArrayList<String>();
        wordDict.add("cats");
        wordDict.add("dog");
        wordDict.add("sand");
        wordDict.add("and");
        wordDict.add("cat");
    	
    	Solution solution = new Solution(); 
        System.out.println(solution.wordBreak(s, wordDict));
    }
}

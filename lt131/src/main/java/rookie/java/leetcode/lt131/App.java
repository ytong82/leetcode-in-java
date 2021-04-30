package rookie.java.leetcode.lt131;

import java.util.List;

public class App {
    public static void main( String[] args ) {
    	Solution solution = new Solution();
    	String s = "aab";
    	List<List<String>> reses = solution.partition(s);
    	for (List<String> res : reses) {
    		System.out.println(res);
    	}
    }
}

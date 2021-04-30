package rookie.java.leetcode.lt187;

import java.util.List;

public class App 
{
    public static void main( String[] args )
    {
    	Solution solution = new Solution();
    	//String s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
    	String s = "AAAAAAAAAAA";
    	List<String> rdSeqs = solution.findRepeatedDnaSequences(s);
    	
    	System.out.print("[");
    	for (String rdSeq : rdSeqs) {
    		System.out.printf("%s ", rdSeq);
    	}
    	System.out.print("]");
    }
}

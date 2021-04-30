package rookie.java.leetcode.lt58;

public class Solution {
	 public int lengthOfLastWord(String s) {
		 String[] strs = s.split(" ");
		 if (strs.length > 0) {
			 return strs[strs.length - 1].length();
		 } else {
			 return 0;
		 }
	 }
}

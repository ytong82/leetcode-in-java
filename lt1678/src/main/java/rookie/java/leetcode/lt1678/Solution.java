package rookie.java.leetcode.lt1678;

public class Solution {
	public String interpret(String command) {
		String res = "";
		for (int i=0; i<command.length();) {
			if (command.charAt(i) == '(') {
				if (command.substring(i,i+2).equals("()")) {
					res = res + "o";
					i += 2;
					
				} else if (command.substring(i, i+4).equals("(al)")) {
					res = res + "al";
					i += 4;
				}
			} else {
				res = res + "G";
				i++;
			}
		}
        return res;
    }
}

package rookie.java.leetcode.lt804;

import java.util.HashSet;
import java.util.Set;

public class Solution {
	String[] alphabets = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---",
			"-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--",
			"-..-","-.--","--.."};
	
	public int uniqueMorseRepresentations(String[] words) {
		Set<String> morses= new HashSet<String>();
		
		for (String word : words) {
			String morse = "";
			for (int i=0; i<word.length(); i++) {
				int index = word.charAt(i) - 'a';
				morse = morse + alphabets[index]; 
			}
			morses.add(morse);
		}
	
		return morses.size();
    }
}

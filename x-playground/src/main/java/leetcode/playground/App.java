package leetcode.playground;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class App 
{
    public static void main( String[] args )
    {
        /*int[] array = new int[5];
        
        for (int item : array) {
        	System.out.println(item);
        }
        
        System.out.println();
        
        int width = 6;
        int height = 5;
        int[][] twoDArray = new int[height][width];
        
        for (int i=0; i<height; ++i) {
        	for (int j=0; j<width; ++j) {
        		System.out.print(Integer.toString(twoDArray[i][j]) + ' ');
        	}
        	System.out.println();
        }
        
        System.out.println();
        */
        String[] vowel = {"A", "a", "E", "e", "I", "i", "O", "o", "U", "u"};
        List<String> vowels = Arrays.asList(vowel);
        String string = "Hello, World!";
        
        List<Integer> indexes = new LinkedList<Integer>();
        for (int i=0; i<string.length(); i++) {
        	if (vowels.contains(Character.toString(string.charAt(i)))) {
        		indexes.add(i);
        	}
        }
        
        String filteredStr = "";
        int anchor = 0;
        for (int index : indexes) {
        	filteredStr += string.substring(anchor, index);
        	anchor = index + 1;
        }
        filteredStr += string.substring(anchor);
        System.out.println(filteredStr);  
    }
}

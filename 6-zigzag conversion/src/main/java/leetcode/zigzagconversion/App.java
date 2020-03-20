package leetcode.zigzagconversion;

public class App 
{
    public static void main( String[] args )
    {
    	//String s = "PAYPALISHIRING";
    	//int numRows = 3;
    	
    	//String s = "PAYPALISHIRING";
    	String s = "A";
    	int numRows = 1;
    	
    	Solution solution = new Solution();
    	String res = solution.convert(s, numRows);
    	
    	System.out.println(res);
    }
}

package leetcode.validanagram;

public class App 
{
    public static void main( String[] args )
    {
        String s = "aacc";
        String t = "ccac";
        
        Solution solution = new Solution();
        System.out.println(solution.isAnagram(s, t));
    }
}

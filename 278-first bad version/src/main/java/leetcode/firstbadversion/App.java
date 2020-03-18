package leetcode.firstbadversion;

public class App 
{
    public static void main( String[] args )
    {
        int n = 5;
        int firstBadVersion = 2;
        
        Solution solution = new Solution(firstBadVersion);
        System.out.printf("First bad version is %d.", solution.firstBadVersion(n));
    }
}

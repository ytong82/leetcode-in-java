package rookie.java.leetcode.lt933;

public class App 
{
    public static void main( String[] args )
    {
    	RecentCounter recentCounter = new RecentCounter();
    	System.out.printf("%s ", recentCounter.ping(1));
        System.out.printf("%s ", recentCounter.ping(100));
        System.out.printf("%s ", recentCounter.ping(3001));
        System.out.printf("%s ", recentCounter.ping(3002));
        System.out.printf("%s ", recentCounter.ping(3003));
    }
}

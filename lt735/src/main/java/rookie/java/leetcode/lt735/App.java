package rookie.java.leetcode.lt735;

public class App 
{
    public static void main( String[] args ) {
        //int[] asteroids = {5,10,-5};
    	int[] asteroids = {10,2,-5};
    	Solution solution = new Solution();
        int[] res = solution.asteroidCollision(asteroids);
        
        System.out.print("[");
        for (int i=0; i<res.length; i++) {
        	if (i < res.length - 1) {
        		System.out.printf("%s,", res[i]);
        	} else {
        		System.out.printf("%s", res[i]);
        	}
        }
        System.out.println("]");
    }
}

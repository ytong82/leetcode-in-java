package rookie.java.leetcode.lt71;

public class App {
    public static void main( String[] args ) {
    	Solution solution = new Solution();
    	String[] paths = {"/home", "/../", "/home//foo/", "/a/./b/../../c/"};
    	for (String path : paths) {
    		System.out.println(solution.simplifyPath(path));
    	}
    }
}

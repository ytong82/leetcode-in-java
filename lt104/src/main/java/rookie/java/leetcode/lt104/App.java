package rookie.java.leetcode.lt104;

public class App {
    public static void main( String[] args ) {
    	Solution solution = new Solution();
    	
        TreeNode root = new TreeNode(3);
        TreeNode node = new TreeNode(9);
        TreeNode node2 = new TreeNode(20);
        TreeNode node3 = new TreeNode(15);
        TreeNode node4 = new TreeNode(7);
        
        root.left = node;
        root.right = node2;
        node2.left = node3;
        node2.right = node4;
        
        System.out.println(solution.maxDepth(root));
    }
}

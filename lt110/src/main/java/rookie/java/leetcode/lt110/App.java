package rookie.java.leetcode.lt110;

public class App {
    public static void main( String[] args ) {
        /*TreeNode root = new TreeNode(3);
        TreeNode node = new TreeNode(9);
        TreeNode node2 = new TreeNode(20);
        root.left = node;
        root.right = node2;
        
        TreeNode node3 = new TreeNode(15);
        TreeNode node4 = new TreeNode(7);
        node2.left = node3;
        node2.right = node4;*/
    	
    	TreeNode root = new TreeNode(1);
        TreeNode node = new TreeNode(2);
        TreeNode node2 = new TreeNode(2);
        root.left = node;
        root.right = node2;
        
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(3);
        node.left = node3;
        node.right = node4;
        
        TreeNode node5 = new TreeNode(4);
        TreeNode node6 = new TreeNode(4);
        node3.left = node5;
        node3.right = node6;
        
        Solution solution = new Solution();
        System.out.println(solution.isBalanced(null));
    }
}

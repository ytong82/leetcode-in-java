package rookie.java.leetcode.lt865;

public class App {
    public static void main( String[] args ) {
        TreeNode root = new TreeNode(3);
        TreeNode node = new TreeNode(5);
        TreeNode node2 = new TreeNode(1);
        root.left = node;
        root.right = node2;
        
        TreeNode node3 = new TreeNode(6);
        TreeNode node4 = new TreeNode(2);
        node.left = node3;
        node.right = node4;
        
        TreeNode node5 = new TreeNode(0);
        TreeNode node6 = new TreeNode(8);
        node2.left = node5;
        node2.right = node6;
        
       /* TreeNode node7 = new TreeNode(7);
        TreeNode node8 = new TreeNode(4);
        node4.left = node7;
        node4.right = node8;*/
    	
    	/*TreeNode root = new TreeNode(0);
        TreeNode node = new TreeNode(1);
        TreeNode node2 = new TreeNode(3);
        root.left = node;
        root.right = node2;
        
        TreeNode node3 = new TreeNode(2);
        node.right = node3;*/
        
        Solution solution = new Solution();
        TreeNode subRoot = solution.subtreeWithAllDeepest(root);
        
        System.out.println(subRoot.val);
    }
}

package rookie.java.leetcode.lt98;

public class App {
    public static void main( String[] args ) {
    	TreeNode root = new TreeNode(3);
    	TreeNode node = new TreeNode(1);
    	TreeNode node2 = new TreeNode(5);
    	root.left = node;
    	root.right = node2;
    	
    	TreeNode node3 = new TreeNode(0);
    	TreeNode node4 = new TreeNode(2);
    	node.left = node3;
    	node.right = node4;
    	
    	TreeNode node5 = new TreeNode(4);
    	TreeNode node6 = new TreeNode(6);
    	node2.left = node5;
    	node2.right = node6;
    	
    	TreeNode node7 = new TreeNode(3);
    	node4.right = node7;
    	
    	Solution solution = new Solution();
        System.out.println(solution.isValidBST(root));
    }
}

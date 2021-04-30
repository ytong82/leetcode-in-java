package rookie.java.leetcode.lt897;

import rookie.java.leetcode.lt897.iterative.Solution;

public class App {
    public static void main( String[] args ) {
    	/*TreeNode root = new TreeNode(5);
    	TreeNode node = new TreeNode(3);
    	TreeNode node2 = new TreeNode(6);
    	root.left = node;
    	root.right = node2;
    	
    	TreeNode node3 = new TreeNode(2);
    	TreeNode node4 = new TreeNode(4);
    	node.left = node3;
    	node.right = node4;
    	
    	TreeNode node5 = new TreeNode(1);
    	node3.left = node5;
    	
    	TreeNode node6 = new TreeNode(8);
    	node2.right = node6;
    	
    	TreeNode node7 = new TreeNode(7);
    	TreeNode node8 = new TreeNode(9);
    	node6.left = node7;
    	node6.right = node8; */
    	
    	TreeNode root = new TreeNode(2);
    	TreeNode node = new TreeNode(1);
    	TreeNode node2 = new TreeNode(4);
    	TreeNode node3 = new TreeNode(3);
    	
    	root.left = node;
    	root.right = node2;
    	node2.left = node3;
    	
    	Solution solution = new Solution();
    	TreeNode head = solution.increasingBST(root);
    
    	while (head != null) {
    		System.out.printf("%s-> ", head.val);
    		head = head.right;
    	}
    }
}

package rookie.java.leetcode.lt100;

public class App {
    public static void main( String[] args ) {
        /*TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(3);
        root.left = node1;
        root.right = node2;
        
        TreeNode root2 = new TreeNode(1);
        TreeNode node12 = new TreeNode(2);
        TreeNode node22 = new TreeNode(3);
        root2.left = node12;
        root2.right = node22;
    	
    	TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        root.left = node1;
        
        TreeNode root2 = new TreeNode(1);
        TreeNode node12 = new TreeNode(2);
        root2.right = node12; 
    	
    	TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(1);
        root.left = node1;
        root.right = node2;
        
        TreeNode root2 = new TreeNode(1);
        TreeNode node12 = new TreeNode(1);
        TreeNode node22 = new TreeNode(2);
        root2.left = node12;
        root2.right = node22;
    	
    	TreeNode root = null;
    	TreeNode root2 = null;*/
    	
    	TreeNode root = new TreeNode(1);
    	
    	TreeNode root2 = new TreeNode(1);
        TreeNode node22 = new TreeNode(2);
        root2.right = node22;
    	
        Solution solution = new Solution();
        System.out.println(solution.isSameTree(root, root2));
    }
}

package rookie.java.leetcode.lt173;

public class App {
    public static void main( String[] args ) {
        TreeNode root = new TreeNode(7);
        TreeNode node = new TreeNode(3);
        TreeNode node2 = new TreeNode(15);
        root.left = node;
        root.right = node2;
        
        TreeNode node3 = new TreeNode(9);
        TreeNode node4 = new TreeNode(20);
        node2.left = node3;
        node2.right = node4;
        
        BSTIterator iter = new BSTIterator(root);
        while (iter.hasNext()) {
        	System.out.printf("%s -> ", iter.next());
        }
        System.out.println();
    }
}

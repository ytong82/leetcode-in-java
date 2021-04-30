package rookie.java.leetcode.lt1379;

public class App {
    public static void main( String[] args ) {
        TreeNode root = new TreeNode(7);
        TreeNode node = new TreeNode(4);
        TreeNode node2 = new TreeNode(3);
        root.left = node;
        root.right = node2;
        
        TreeNode node3 = new TreeNode(6);
        TreeNode node4 = new TreeNode(19);
        node2.left = node3;
        node2.right = node4;
        
        TreeNode croot = new TreeNode(7);
        TreeNode cnode = new TreeNode(4);
        TreeNode cnode2 = new TreeNode(3);
        croot.left = cnode;
        croot.right = cnode2;
        
        TreeNode cnode3 = new TreeNode(6);
        TreeNode cnode4 = new TreeNode(19);
        cnode2.left = cnode3;
        cnode2.right = cnode4;
        
        Solution solution = new Solution();
        TreeNode target = solution.getTargetCopy(root, croot, node2);
        
        System.out.println(target.val);
    }
}

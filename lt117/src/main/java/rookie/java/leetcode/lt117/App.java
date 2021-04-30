package rookie.java.leetcode.lt117;

public class App {
    public static void main( String[] args ) {
        Node root = new Node(1);
        Node node = new Node(2);
        Node node2 = new Node(3);
        root.left = node;
        root.right = node2;
        
        Node node3 = new Node(4);
        Node node4 = new Node(5);
        node.left = node3;
        node.right = node4;
        
        Node node5 = new Node(7);
        node2.right = node5;
        
        Solution solution = new Solution();
        solution.connect(root);
        System.out.printf("%s -> %s \n", root.val, root.right);
        System.out.printf("%s -> %s \n", node.val, node.right);
        System.out.printf("%s -> %s \n", node2.val, node2.right);
        System.out.printf("%s -> %s \n", node3.val, node3.right);
        System.out.printf("%s -> %s \n", node4.val, node4.right);
        System.out.printf("%s -> %s \n", node5.val, node5.right);
    }
}

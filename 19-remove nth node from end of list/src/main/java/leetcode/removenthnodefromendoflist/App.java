package leetcode.removenthnodefromendoflist;

public class App 
{
    public static void main( String[] args )
    {
    	/*int[] arr = {1, 2, 3, 4, 5};*/
    	int[] arr = {1};
    	int n = 1;
    	
        Helper helper = new Helper();
        ListNode head = helper.createLinkedList(arr);
        helper.printLinkedList(head);
        
        Solution solution = new Solution();
        head = solution.removeNthFromEnd(head, n);
        helper.printLinkedList(head);
    }
}

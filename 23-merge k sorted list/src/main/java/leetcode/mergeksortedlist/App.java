package leetcode.mergeksortedlist;

public class App 
{
    public static void main( String[] args )
    {
    	int[][] arrays = {
    			{1, 4, 5}, 
    			{1, 3, 4},
    			{2, 6}
    			};
    	
    	Helper helper = new Helper();
    	ListNode[] lists = helper.createListNode(arrays);
    	
    	for(ListNode listNode : lists) {
    		helper.printListNode(listNode);
    	}
    	
    	Solution solution = new Solution();
    	ListNode head = solution.mergeKLists(lists);
    	helper.printListNode(head);
    }
}

package leetcode;
/*
 * Given a linked list, reverse the nodes of a linked list k at a time and return its modified list.

k is a positive integer and is less than or equal to the length of the linked list. If the number of nodes is not a multiple of k then left-out nodes in the end should remain as it is.

Example:

Given this linked list: 1->2->3->4->5

For k = 2, you should return: 2->1->4->3->5

For k = 3, you should return: 3->2->1->4->5

Note:

Only constant extra memory is allowed.
You may not alter the values in the list's nodes, only nodes itself may be changed.
 */
public class ReverseNodes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]={1,2,3,4,5};
		ListNode list = ListNode.retListNode(nums);
		
		ReverseNodes o  = new ReverseNodes();
		list = o.Reserve(list);
		ListNode.cout(list);
	}
	public ListNode Reserve(ListNode node)
    {
		ListNode prev = null;
        ListNode next = null;

        while (node != null)
        {
            next = node.next;

            node.next = prev;

            prev = node;

            node = next;
        }
        return prev;
    }

}

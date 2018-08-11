package leetcode;
/*
 * Given a linked list, swap every two adjacent nodes and return its head.

Example:

Given 1->2->3->4, you should return the list as 2->1->4->3.
Note:

Your algorithm should use only constant extra space.
You may not modify the values in the list's nodes, only nodes itself may be changed.
 */
public class _24_Swap_Nodes_in_Pairs {
	public static void main(String args[]){
		_24_Swap_Nodes_in_Pairs o  = new _24_Swap_Nodes_in_Pairs();
		int nums[]={1,2,3,4};
		ListNode ret= ListNode.retListNode(nums);
		ret= o.swapPairs(ret);
		ListNode.cout(ret);
	}
	public ListNode swapPairs(ListNode head){
		ListNode ret = new ListNode(0);
		ret.next = head;
		ListNode pre= ret;
		while(head!=null&&head.next!=null){
			ListNode second= head.next;
			head.next = second.next;
			second.next = head;
			pre.next = second;
			pre = head;
			
			head = head.next;
		}
		return ret.next;
	}
	
}

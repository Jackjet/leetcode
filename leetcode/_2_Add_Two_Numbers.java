package leetcode;
/*
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Example:

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
Explanation: 342 + 465 = 807.
 */
public class _2_Add_Two_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_2_Add_Two_Numbers o = new _2_Add_Two_Numbers();
		int nums[]={2,4,3},nums2[]={5,6,4};
		ListNode l1=ListNode.retListNode(nums),
				l2 = ListNode.retListNode(nums2);
		ListNode ret= o.addTwoNumbers(l1, l2);
		ListNode.cout(ret);
	}
	 public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	        if(l1==null)return l2;
	        else if(l2==null)return l1;
	        else{
	            ListNode ret=new ListNode(-1);
	            ListNode r=ret;
	            int tag=0;
	            while(l1!=null&&l2!=null){
	                int t1=l1.val+l2.val+tag;
	                tag=0;
	                if(t1>=10){
	                    tag=1;
	                    t1=t1%10;
	                }
	                ret.next= new ListNode(t1);
	                l1=l1.next;
	                l2=l2.next;
	                ret=ret.next;
	            }
	            while(l1!=null){
	               int t1=l1.val+tag;
	                tag=0;
	                if(t1>=10){
	                    tag=1;
	                    t1=t1%10;
	                }
	                ret.next= new ListNode(t1);
	                l1=l1.next;
	                
	                ret=ret.next;
	            }
	            while(l2!=null){
	                int t1=l2.val+tag;
	                tag=0;
	                if(t1>=10){
	                    tag=1;
	                    t1=t1%10;
	                }
	                ret.next= new ListNode(t1);
	                l2=l2.next;
	                
	                ret=ret.next;
	            }
	            if(tag==1){
	                ret.next= new ListNode(tag);
	                ret=ret.next;
	            }
	            return r.next;
	        }
	    }

}

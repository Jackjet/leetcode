package leetcode;
/*
Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.

Example:

Input: 1->2->4, 1->3->4
Output: 1->1->2->3->4->4
 */
public class _21_Merge_Two_Sorted_Lists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_21_Merge_Two_Sorted_Lists o =new _21_Merge_Two_Sorted_Lists();
		int n1[]={1,2,4};
		int n2[]={1,3,4};
		ListNode l1=ListNode.retListNode(n1);
		ListNode l2=ListNode.retListNode(n2);
		ListNode ret=o.mergeTwoLists(l1, l2);
		ListNode.cout(ret);
	}
	
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null)return l2;
        if(l2==null)return l1;
        ListNode ret=new ListNode(-1);
        ListNode r=ret;
        int t1,t2;
       
        
        while(l1!=null||l2!=null){
            if(l1==null){
                ret.next=l2;
                break;
                 
            }
            else if(l2==null){
            	ret.next=l1;
                break;
            }
            else{
                t1=l1.val;
                t2=l2.val;
                if(t1>t2){
                    ret.next=new ListNode(t2);
                    l2=l2.next;
                    ret=ret.next;
                }
                else {
                    ret.next=new ListNode(t1);
                    l1=l1.next;
                    ret=ret.next;
                }
            }
            
        }
        return r.next;
    }
}

  
 
 


package leetcode;
/*Merge k sorted linked lists and return it as one sorted list. Analyze and describe its complexity.

Example:

Input:
[
  1->4->5,
  1->3->4,
  2->6
]
Output: 1->1->2->3->4->4->5->6
 * 
 */
public class _23_Merge_k_Sorted_Lists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_23_Merge_k_Sorted_Lists o = new _23_Merge_k_Sorted_Lists();
		int n1[]={1,7,5};
		int n2[]={1,3,4};
		int n3[]={2,6};
		
		
		ListNode l1=ListNode.retListNode(n1);
		l1=ListNode.sort(l1,new PriceComparator(){
			
		});
		ListNode.cout(l1);
		ListNode l2=ListNode.retListNode(n2);
		ListNode l3=ListNode.retListNode(n3);
		ListNode lists[]={l1,l2,l3};
		
		ListNode ret=o.mergeKLists(lists);
		ListNode.cout(ret);
	}
	public ListNode mergeKLists(ListNode[] lists) {
        ListNode ret= null;
        if(lists.length==1)return lists[0];
        else if(lists.length<=0)return ret;
        else{
            ret = mergerTwo(lists[0],lists[1]);
            for(int i=2;i<lists.length;i++){
                ret = mergerTwo(ret,lists[i]);
            }
            return ret;
        }
    }
    public ListNode mergerTwo(ListNode l1,ListNode l2){
        ListNode ret = new ListNode(-1);
        ListNode r=ret;
        if(l1==null)return l2;
        else if(l2==null)return l1;
        else {
            while(l1!=null&&l2!=null){
                int val;
                if(l1.val<l2.val){
                    val =l1.val;
                    l1=l1.next;
                }
                else{
                    val =l2.val;
                    l2=l2.next;
                }
                ret.next=new ListNode(val);
                ret=ret.next;
            }
            while(l1!=null){
                ret.next=new ListNode(l1.val);
                ret=ret.next;
                l1= l1.next;
            }
            while(l2!=null){
                ret.next=new ListNode(l2.val);
                ret=ret.next;
                l2= l2.next;
            }
        }
        return r.next;
    }

}

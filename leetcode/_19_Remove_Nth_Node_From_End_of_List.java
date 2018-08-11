package leetcode;

public class _19_Remove_Nth_Node_From_End_of_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_19_Remove_Nth_Node_From_End_of_List o = new _19_Remove_Nth_Node_From_End_of_List();
		ListNode node=new ListNode(0);
		int nums[]={1,2,3,4,5};
		ListNode head=node;
		for(int i =0;i<nums.length;i++){
			ListNode temp = new ListNode(nums[i]);
			
//			System.out.print(i);	
			node.next=temp;
			node = node.next;
			
		}
//		while(head!=null){
//			
//			System.out.println(head.val);
//			head = head.next;
//		}
		ListNode ret = o.removeNthFromEnd(head, 2);
		while(ret!=null){
			System.out.println(ret.val);
			ret = ret.next;
		}
		

	}
	public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head,ret =new ListNode(0);//添加头结点
        ret.next = head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
       
        
        int index= count-n;
        temp = ret;
        for(int i=0;i<index;i++){
           temp = temp.next;
                
        }
        temp.next = temp.next.next;
        
        return ret.next;
        
        
    }
}
  



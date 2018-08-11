package leetcode;

import java.util.Comparator;

public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
      public static ListNode retListNode(int nums[]){
  		ListNode node=new ListNode(0);
  		ListNode head=node;
  		for(int i =0;i<nums.length;i++){
  			ListNode temp = new ListNode(nums[i]);
  			
//  			System.out.print(i);	
  			node.next=temp;
  			node = node.next;
  			
  		}
  		return head.next;
  	}
      public static void cout(ListNode listnode){
    	  if(null==listnode)return;
    	  while(listnode.next!=null){
    		  System.out.print(listnode.val+"\t");
    		  listnode= listnode.next;
    	  }
    	  System.out.println(listnode.val);
      }
      public static ListNode sort(ListNode list,PriceComparator pri){
    	  ListNode ret = new ListNode(-1);
    	  ListNode r=ret;
    	  int count = 0;
    	  ListNode temp=list;
    	  while(null!=temp){
    		  count++;
    		  temp=temp.next;
    	  }
    	  int nums[]=new int[count];
    	  count=0;
    	  while(list!=null){
    		  nums[count++]=list.val;
    		  list=list.next;
    	  }
    	  for(int i =0;i<nums.length;i++){
    		  for(int j=nums.length-1;j>i;j--){
    			  if(pri.compare(nums[j], nums[j-1])>0){
    				  int t=nums[j];
    				  nums[j]=nums[j-1];
    				  nums[j-1]=t;
    				  
    			  }
    		  }
    	  }
    	  for(int i =0;i<nums.length;i++){
    		  ret.next= new ListNode(nums[i]);
    		  ret=ret.next;
    	  }
    	  return r.next;
      }
     
}
class PriceComparator implements Comparator {
	public int compare(Object object1, Object object2) {// 实现接口中的方法
		int p1 = (int) object1; // 强制转换
		int p2 = (int) object2;
		return p2-p1;
	}
}

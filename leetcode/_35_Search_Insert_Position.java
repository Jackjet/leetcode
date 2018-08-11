package leetcode;
/*
 * Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You may assume no duplicates in the array.

Example 1:

Input: [1,3,5,6], 5
Output: 2
Example 2:

Input: [1,3,5,6], 2
Output: 1
Example 3:

Input: [1,3,5,6], 7
Output: 4
Example 4:

Input: [1,3,5,6], 0
Output: 0
 */
public class _35_Search_Insert_Position {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_35_Search_Insert_Position o = new _35_Search_Insert_Position();
		int nums[]={1,3,5,6};
		int target= 7;
		int ret= o.searchInsert(nums, target);
		System.out.println(ret);
	}
	 public int searchInsert(int[] nums, int target) {
	        int start = 0;
	        int end=nums.length-1;
	        
	        int index=0;
	        
	        while(start<=end){
	            int mid = (start+end)/2;
	            int nmid= nums[mid];
	            if(nmid == target){
	                index = mid;
	                return index;
	            }
	            else if(nmid<target){
	                start =mid+1;
	               
	            }
	            else{
	                end=mid-1;
	                
	            }
	        }
	        index=start;
	        return index;
	    }

}

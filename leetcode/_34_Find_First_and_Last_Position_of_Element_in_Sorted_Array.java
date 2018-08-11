package leetcode;
/*
 * Given an array of integers nums sorted in ascending order, find the starting and ending position of a given target value.

Your algorithm's runtime complexity must be in the order of O(log n).

If the target is not found in the array, return [-1, -1].

Example 1:

Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
Example 2:

Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]
 */
public class _34_Find_First_and_Last_Position_of_Element_in_Sorted_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_34_Find_First_and_Last_Position_of_Element_in_Sorted_Array o =new _34_Find_First_and_Last_Position_of_Element_in_Sorted_Array();
		int nums[]={5,7,7,8,8,10};
		int target= 8;
		int ret[]= o.searchRange(nums, target);
		new array().cout(ret);
	}
	 public int[] searchRange(int[] nums, int target) {
	        int ret[]= {-1,-1};
	        int start=0;
	        int end= nums.length-1;
	        while(start<=end){
	            int mid = (start+end)/2;
	            if(nums[mid]==target){
	                ret[0]=mid;
	                ret[1]=mid;
	                int cur=mid;
	                while(cur-1>=0&&nums[--cur]==target)ret[0]=cur;
	                cur=mid;
	                while(cur+1<nums.length&&nums[++cur]==target)ret[1]=cur;
	                return ret;
	            }
	            else if(nums[mid]<target)start =mid+1;
	            else if(nums[mid]>target)end = mid-1;
	        }
	        return ret;
	    }

}

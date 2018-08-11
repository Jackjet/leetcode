package leetcode;

import java.util.HashSet;
import java.util.Set;

/*
 * Given an array nums containing n + 1 integers where each integer is between 1 and n (inclusive), prove that at least one duplicate number must exist. Assume that there is only one duplicate number, find the duplicate one.

Example 1:

Input: [1,3,4,2,2]
Output: 2
Example 2:

Input: [3,1,3,4,2]
Output: 3
Note:

You must not modify the array (assume the array is read only).
You must use only constant, O(1) extra space.
Your runtime complexity should be less than O(n2).
There is only one duplicate number in the array, but it could be repeated more than once.
 */
public class _287_Find_the_Duplicate_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_287_Find_the_Duplicate_Number o =new _287_Find_the_Duplicate_Number();
		int nums[]={1,3,4,2,2};
		int ret= o.findDuplicate(nums);
		System.out.println(ret);
	}
	 public int findDuplicate(int[] nums) {
	       Set<Integer> set= new HashSet();
	        for(int temp:nums){
	            if(set.contains(temp))return temp;
	            else set.add(temp);
	        }
	        return -1;
	            
	        
	    }
	

}

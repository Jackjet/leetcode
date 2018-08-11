package leetcode;
/*
 * Given an unsorted integer array, find the smallest missing positive integer.

Example 1:

Input: [1,2,0]
Output: 3
Example 2:

Input: [3,4,-1,1]
Output: 2
Example 3:

Input: [7,8,9,11,12]
Output: 1
Note:

Your algorithm should run in O(n) time and uses constant extra space.
 */
public class _41_First_Missing_Positive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_41_First_Missing_Positive o =new _41_First_Missing_Positive();
		int nums[]={3,4,-1,1};
		int ret= o.firstMissingPositive(nums);
		System.out.println(ret);
	}
	 public int firstMissingPositive(int[] nums) {
	      for(int i =  0; i < nums.length; i++){
	        while(nums[i] > 0 && nums[i] - 1 < nums.length && nums[i] - 1 != i && nums[nums[i]-1] != nums[i]){
	           swap(nums, i, nums[i] - 1); 
	        }  
	      }   

	      int i = 0;
	      for(; i < nums.length; i++){
	        if(i + 1 != nums[i]) break;
	      }
	      return i + 1;
	    }
	    
	    void swap(int[] nums, int i, int j){
	      int t = nums[i];
	      nums[i] = nums[j];
	      nums[j] = t;
	    }
}

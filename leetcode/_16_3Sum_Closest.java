package leetcode;

import java.util.Arrays;
/*
 * Given an array nums of n integers and an integer target, find three integers in nums such that the sum is closest to target. Return the sum of the three integers. You may assume that each input would have exactly one solution.

Example:

Given array nums = [-1, 2, 1, -4], and target = 1.

The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
 */
public class _16_3Sum_Closest {
	public static void main(String args[]){
		int nums[] ={-3,0,1,2};
		int target = 1;
		System.out.println(threeSumClosest(nums, target));
	}
	    public static int threeSumClosest(int[] nums, int target) {
	        int size = nums.length;
	        Arrays.sort(nums);
	        int max = Integer.MAX_VALUE;
	        int ret =0;
	        if(size<= 3){
	            for(int temp : nums)ret+=temp;
	            return ret;
	        }
	        for(int i = 0; i<nums.length-2; i++){
	            int left =i+1;
	            int right = nums.length-1;
	            while(left<right){
	                int sum  = nums[i]+nums[left]+nums[right];
	                if(target == sum)return sum;
	                if(Math.abs(sum-target)<max){
	                    max=Math.abs(sum-target);
	                    ret = sum;
	                    
	                }
	                if(sum<target){
	                	left++;
	                }
	                else right--;
	            }
	        }
	            return ret;
	    }
	
}

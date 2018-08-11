package leetcode;
import java.util.*;
/*
Given an array nums of n integers and an integer target, are there elements a, b, c, and d in nums such that a + b + c + d = target? Find all unique quadruplets in the array which gives the sum of target.

Note:

The solution set must not contain duplicate quadruplets.

Example:

Given array nums = [1, 0, -1, 0, -2, 2], and target = 0.

A solution set is:
[
  [-1,  0, 0, 1],
  [-2, -1, 1, 2],
  [-2,  0, 0, 2]
]
 */
public class _18_4Sum {
	public static void main(String args[]){
		_18_4Sum o = new _18_4Sum();
		int nums[] = {-1,0,1,2,-1,-4};
		System.out.println(o.fourSum(nums,-1));
	}
	 public List<List<Integer>> fourSum(int[] nums, int target) {
		 	Arrays.sort(nums);
	        List<List<Integer>> list = new ArrayList();
		    int length = nums.length;
	        for(int i = 0 ;i<length-3 ;i++){
	            if(nums[i]+nums[i+1]+nums[i+2]+nums[i+3]>target)break;
             if(nums[i]+nums[length-1]+nums[length-2]+nums[length-3]<target)continue;
             if(i>0 && nums[i]==nums[i-1])continue;
	            for(int j = i+1;j<length-2;j++){
                 if(nums[i]+nums[i+1]+nums[i+2]+nums[j]>target)break;
                 if(nums[i]+nums[length-1]+nums[length-2]+nums[j]<target)continue;
                 if(j>i+1 && nums[j]==nums[j-1])continue;
	                int left = j+1;
	                int right =length-1;
	                while(left<right){
	                    int sum = nums[i]+nums[j]+nums[left]+nums[right];
	                    if(sum == target){
	                        list.add(Arrays.asList( nums[i],nums[j],nums[left],nums[right]));
	                        while(left<right && nums[left]==nums[left+1])left++;
	                        while(left<right && nums[right]==nums[right-1])right--;
	                        left++;
	                        right--;
	                    }
	                    if(sum<target)left++;
	                    else if(sum>target)right--;
	                }
	            }
	        }
		    return list;
	    }
}

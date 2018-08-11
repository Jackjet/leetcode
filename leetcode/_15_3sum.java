package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _15_3sum {
	public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        
        List<List<Integer>> list =new ArrayList();
       
        for(int i =0 ;i<nums.length-2;i++){
            
            if(i==0 ||(i>0 && nums[i]!=nums[i-1])){
            	int left=i+1,right = nums.length-1,sum = 0-nums[i];
            	
                while(left<right){
                	
                    if(nums[left]+nums[right]==sum){
                      list.add(Arrays.asList(nums[i],nums[left],nums[right]));  
                      while(left<right&&nums[left]==nums[left+1])left++;
                      while(left<right&&nums[right]==nums[right-1])right--;
                      left++;
                      right--;
                      
                    }
                    else if(nums[left]+nums[right]<sum)left++;
                    else right--;
                   
                    
                }
            }
        }
        return list;
    }
	public static void main(String args[]){
		_15_3sum o = new _15_3sum();
		int num[] ={-1, 0, 1, 2, -1, -4,0,0};
		System.out.println(o.threeSum(num));
	}
}

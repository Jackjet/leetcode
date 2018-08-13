package leetcode;
/*
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
 */
public class _1_Two_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_1_Two_Sum o = new _1_Two_Sum();
		int nums[]={2,7,11,15};
		int target= 9;
		int ret []=o.twoSum(nums, target);
		new array().cout(ret);
	}
	public int[] twoSum(int[] nums, int target) {
        int ret[]=new int[2];
        for(int i =0;i<nums.length;i++){
            for(int j =i+1;j<nums.length;j++){
                if(target==nums[i]+nums[j]){
                    ret[0]=i;
                    ret[1]=j;
                    return ret;
                }
            }
        }
        return ret;
    }

}

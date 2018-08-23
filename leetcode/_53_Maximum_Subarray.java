package leetcode;

/*
 * Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

Example:

Input: [-2,1,-3,4,-1,2,1,-5,4],
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.
Follow up:

If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.
 */
public class _53_Maximum_Subarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_53_Maximum_Subarray o = new _53_Maximum_Subarray();
		int[] nums={-2,-1,-3,-1,-1,-1,-1,-5,-1};
		int ret= o.maxSubArray(nums);
		System.out.println(ret);
	}
	public int maxSubArray(int[] nums) {
        // if current subArray's sum is smaller than 0, we should start a new subarray.
        // which means reset the sum to 0.
        int subSum = 0;
        int subMax = nums[0];
        for (int i = 0; i < nums.length; i++) {
            subSum += nums[i];
            subMax = subMax > subSum ? subMax : subSum;
            subSum = subSum < 0 ? 0 : subSum;
        }
        return subMax;
    }

}

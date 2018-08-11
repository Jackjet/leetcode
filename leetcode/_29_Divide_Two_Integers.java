package leetcode;

import java.util.Arrays;

/*
 * Given two integers dividend and divisor, divide two integers without using multiplication, division and mod operator.

Return the quotient after dividing dividend by divisor.

The integer division should truncate toward zero.

Example 1:

Input: dividend = 10, divisor = 3
Output: 3
Example 2:

Input: dividend = 7, divisor = -3
Output: -2
Note:

Both dividend and divisor will be 32-bit signed integers.
The divisor will never be 0.
Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [−231,  231 − 1]. For the purpose of this problem, assume that your function returns 231 − 1 when the division result overflows.
 */
public class _29_Divide_Two_Integers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]={1,2,3,4,5};
		int n[]=Arrays.copyOf(nums,6);
		n[2]=5;
		for(int i =0; i<n.length;i++)System.out.print(nums[i]+"\t");
		_29_Divide_Two_Integers o =new _29_Divide_Two_Integers();
		int dividend =-2147483648;
		int divisor = -1;
		int ret= o.divide(dividend, divisor);
		System.out.println(ret);
	}
	
	public int divide(int dividend, int divisor) {
        int sign =1;
        if((dividend<0&&divisor>0)||(dividend>0&&divisor<0))sign=-1;
        long first =Math.abs((long)dividend);
        long second = Math.abs((long)divisor);
        if(first==0)return 0;
        if(second==0)return Integer.MAX_VALUE;
        
       
        if(first<second)return 0;
        
        long ret =li(first,second);
        int ans;
        if(ret>Integer.MAX_VALUE){
            ans =(sign==1)?(Integer.MAX_VALUE):(Integer.MIN_VALUE);
        }
        else{
            ans = (int) (sign*ret);
        }
        return ans;
        
    }
    private long li(long first,long second){
        if(first<second)return 0;
        long i =1;
        long sum=second;
        while((sum+sum)<first){
            sum+=sum;
            i+=i;
        }
        return i+li(first-sum,second);
    }

}

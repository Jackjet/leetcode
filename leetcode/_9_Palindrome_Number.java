package leetcode;
/*
 * Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.

Example 1:

Input: 121
Output: true
Example 2:

Input: -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:

Input: 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
Follow up:

Coud you solve it without converting the integer to a string?
 */
public class _9_Palindrome_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_9_Palindrome_Number o =new _9_Palindrome_Number();
		int x=-121;
		boolean ret= o.isPalindrome(x);
		System.out.println(ret);
	}
	public boolean isPalindrome(int x) {
        String string = String.valueOf(x);
        if(string==null||string.length()<=0)return false;
        int len=string.length();
        if(len==1)return true;
        boolean ret=true;
        for(int i =0,j=len-1;i<=j;i++,j--){
            if(string.charAt(i)!=string.charAt(j))return false;
        }
        return ret;
    }

}

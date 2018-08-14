package leetcode;
/*
 * Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.

Example 1:

Input: "babad"
Output: "bab"
Note: "aba" is also a valid answer.
Example 2:

Input: "cbbd"
Output: "bb"
 */
public class _5_Longest_Palindromic_Substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_5_Longest_Palindromic_Substring o = new _5_Longest_Palindromic_Substring();
		String s="babad";
		String ret = o.longestPalindrome(s);
		System.out.println(ret);
	}
	private int lo, maxLen;
	public String longestPalindrome(String s) {
		int len = s.length();
		if (len < 2)
			return s;
		
	    for (int i = 0; i < len-1; i++) {
	     	extendPalindrome(s, i, i);  //assume odd length, try to extend Palindrome as possible
	     	extendPalindrome(s, i, i+1); //assume even length.
	    }
	    return s.substring(lo, lo + maxLen);
	}

	private void extendPalindrome(String s, int j, int k) {
		while (j >= 0 && k < s.length() && s.charAt(j) == s.charAt(k)) {
			j--;
			k++;
		}
		if (maxLen < k - j - 1) {
			lo = j + 1;
			maxLen = k - j - 1;
		}
	}

}

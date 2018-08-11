package leetcode;
/*
 * Implement strStr().

Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

Example 1:

Input: haystack = "hello", needle = "ll"
Output: 2
Example 2:

Input: haystack = "aaaaa", needle = "bba"
Output: -1
Clarification:

What should we return when needle is an empty string? This is a great question to ask during an interview.

For the purpose of this problem, we will return 0 when needle is an empty string. This is consistent to C's strstr() and Java's indexOf().
 */
public class _28_Implement_strStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_28_Implement_strStr o = new _28_Implement_strStr();
		String str1="",str2="";
		int ret= o.strStr(str1, str2);
		System.out.println(ret);
	}
	 public int strStr(String haystack, String needle) {
	        if(haystack==null)return -1;
	        if(needle==null)return 0;
	        int len1= haystack.length(),len2=needle.length();
	        if(len1<len2)return -1;
	       
	        String str=haystack;
	        int ret=str.indexOf(needle); 
	        if(ret>-1)return ret;
	        return -1;
	        
	    }

}

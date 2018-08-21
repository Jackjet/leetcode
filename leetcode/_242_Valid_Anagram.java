package leetcode;

import java.util.Arrays;

/*
 * Given two strings s and t , write a function to determine if t is an anagram of s.

Example 1:

Input: s = "anagram", t = "nagaram"
Output: true
Example 2:

Input: s = "rat", t = "car"
Output: false
Note:
You may assume the string contains only lowercase alphabets.

Follow up:
What if the inputs contain unicode characters? How would you adapt your solution to such case?
 */
public class _242_Valid_Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_242_Valid_Anagram o = new _242_Valid_Anagram();
		String s="anagram",t="nagaram";
		boolean ret= o.isAnagram(s, t);
		System.out.println(ret);
	}
	 public boolean isAnagram(String s, String t) {
	        if (s==null|| t==null || s.length()!=t.length())return false;
	        char[] c1= s.toCharArray();
	        char[] c2= t.toCharArray();
	        Arrays.sort(c1);
	        Arrays.sort(c2);
//	        System.out.println(c1);
//	        System.out.println(c2);
	        for (int i = 0;i< s.length();i++){
	            if (c1[i]!=c2[i])return false;
	        }
	        return true;
	    }

}

package leetcode;
/*
 * Given an input string (s) and a pattern (p), implement wildcard pattern matching with support for '?' and '*'.

'?' Matches any single character.
'*' Matches any sequence of characters (including the empty sequence).
The matching should cover the entire input string (not partial).

Note:

s could be empty and contains only lowercase letters a-z.
p could be empty and contains only lowercase letters a-z, and characters like ? or *.
Example 1:

Input:
s = "aa"
p = "a"
Output: false
Explanation: "a" does not match the entire string "aa".
Example 2:

Input:
s = "aa"
p = "*"
Output: true
Explanation: '*' matches any sequence.
Example 3:

Input:
s = "cb"
p = "?a"
Output: false
Explanation: '?' matches 'c', but the second letter is 'a', which does not match 'b'.
Example 4:

Input:
s = "adceb"
p = "*a*b"
Output: true
Explanation: The first '*' matches the empty sequence, while the second '*' matches the substring "dce".
Example 5:

Input:
s = "acdcb"
p = "a*c?b"
Output: false

 */
public class _44_Wildcard_Matching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_44_Wildcard_Matching o =new _44_Wildcard_Matching();
		String s="adceb";
		String p="*a*b";
		boolean ret = o.isMatch(s, p);
		System.out.println(ret);
	}
	 public boolean isMatch(String s, String p) {
	        boolean[][] match=new boolean[s.length()+1][p.length()+1];
	        match[s.length()][p.length()]=true;
	        for(int i=p.length()-1;i>=0;i--){
	            if(p.charAt(i)!='*')
	                break;
	            else
	                match[s.length()][i]=true;
	        }
	        for(int i=s.length()-1;i>=0;i--){
	            for(int j=p.length()-1;j>=0;j--){
	                if(s.charAt(i)==p.charAt(j)||p.charAt(j)=='?')
	                        match[i][j]=match[i+1][j+1];
	                else if(p.charAt(j)=='*')
	                        match[i][j]=match[i+1][j]||match[i][j+1];
	                else
	                    match[i][j]=false;
	            }
	        }
	        return match[0][0];
	    }

}

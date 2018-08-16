package leetcode;
/*
 * Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

Example 1:

Input: ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
Note:

All given inputs are in lowercase letters a-z.
 */
public class _14_Longest_Common_Prefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_14_Longest_Common_Prefix o = new _14_Longest_Common_Prefix();
		String strs[]={"flower","flow","flight"};
		String ret = o.longestCommonPrefix(strs);
		System.out.println(ret);
	}
	 public String longestCommonPrefix(String[] strs) {
	        if(strs.length==0)return "";
	        if(strs.length==1)return strs[0];
	        String ret=strs[0];
	        for(int i =1;i<strs.length;i++){
	            int j=0;
	            for( j= 0;j<ret.length()&&j<strs[i].length();j++){
	                if(strs[i].charAt(j)!=ret.charAt(j))
	                    break;
	            }
	            ret=ret.substring(0,j);
	        }
	        return ret;
	    }

}

package leetcode;
/*
 * Given a string, find the length of the longest substring without repeating characters.

Examples:

Given "abcabcbb", the answer is "abc", which the length is 3.

Given "bbbbb", the answer is "b", with the length of 1.

Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */
public class _3_Longest_Substring_Without_Repeating_Characters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_3_Longest_Substring_Without_Repeating_Characters o =new _3_Longest_Substring_Without_Repeating_Characters();
		String s="pwwkew";
		int ret= o.lengthOfLongestSubstring(s);
		System.out.println(ret);
	}
	public int lengthOfLongestSubstring(String s) {
        int ret=1;
        if(s==null||s.length()==0)return 0;
        
        for(int i = 0;i<s.length();i++){
            int r=1;
            for(int j=i+1;j<s.length();j++){
                int tag=1;
                for(int k=i;k<j;k++){
                    if(s.charAt(j)==s.charAt(k)){
                        tag=0;
                        break;
                    }
                }
                if(tag==1)r++;
                else break;
            }
            ret=ret>r?ret:r;
        }
        return ret;
    }

}

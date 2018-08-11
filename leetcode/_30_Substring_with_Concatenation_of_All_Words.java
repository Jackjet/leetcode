package leetcode;

import java.util.*;

/*
 * You are given a string, s, and a list of words, words, that are all of the same length. Find all starting indices of substring(s) in s that is a concatenation of each word in words exactly once and without any intervening characters.

Example 1:

Input:
  s = "barfoothefoobarman",
  words = ["foo","bar"]
Output: [0,9]
Explanation: Substrings starting at index 0 and 9 are "barfoor" and "foobar" respectively.
The output order does not matter, returning [9,0] is fine too.
Example 2:

Input:
  s = "wordgoodstudentgoodword",
  words = ["word","student"]
Output: []
 */
public class _30_Substring_with_Concatenation_of_All_Words {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S= "barfoothefoobarman";
		String L[]={"foo","bar"};
		System.out.println(findSubstring(S, L));
	}
	public static List<Integer> findSubstring(String S, String[] L) {
	    List<Integer> res = new ArrayList<Integer>();
	    if (S == null || L == null || L.length == 0) return res;
	    int len = L[0].length(); // length of each word
	    
	    Map<String, Integer> map = new HashMap<String, Integer>(); // map for L
	    for (String w : L) map.put(w, map.containsKey(w) ? map.get(w) + 1 : 1);
	    
	    for (int i = 0; i <= S.length() - len * L.length; i++) {
	        Map<String, Integer> copy = new HashMap<String, Integer>(map);
	        for (int j = 0; j < L.length; j++) { // checkc if match
	            String str = S.substring(i + j*len, i + j*len + len); // next word
	            if (copy.containsKey(str)) { // is in remaining words
	                int count = copy.get(str);
	                if (count == 1) copy.remove(str);
	                else copy.put(str, count - 1);
	                if (copy.isEmpty()) { // matches
	                    res.add(i);
	                    break;
	                }
	            } else break; // not in L
	        }
	    }
	    return res;
	}

}

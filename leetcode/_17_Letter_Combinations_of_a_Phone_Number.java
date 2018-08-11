package leetcode;
import java.util.*;
/*
 *
Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent.

A mapping of digit to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.

Example:

Input: "23"
Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
 */
public class _17_Letter_Combinations_of_a_Phone_Number {

	public static void main(String[] args) {
		_17_Letter_Combinations_of_a_Phone_Number o =new _17_Letter_Combinations_of_a_Phone_Number();
		System.out.println(o.letterCombinations("7"));

	}
	private static final String[] KEYS = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
    public List<String> letterCombinations(String digits) {
        List<String> list =new ArrayList();
        if(digits.length() == 0) return list;
        combine(list,digits,0,"");
        return list;
    }
    public void combine(List<String> list,String digits,int offline,String str){
        if(offline>=digits.length()){
            list.add(str);
            return ;
        }
        String key = KEYS[digits.charAt(offline)-'0'];
        for(int i =0 ;i<key.length();i++){
            combine(list,digits,offline+1,str+key.charAt(i));
        }
    }
	

}

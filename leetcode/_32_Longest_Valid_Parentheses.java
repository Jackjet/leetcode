package leetcode;

import java.util.Stack;

/*
 * Given a string containing just the characters '(' and ')', find the length of the longest valid (well-formed) parentheses substring.

Example 1:

Input: "(()"
Output: 2
Explanation: The longest valid parentheses substring is "()"
Example 2:

Input: ")()())"
Output: 4
Explanation: The longest valid parentheses substring is "()()"
 */
public class _32_Longest_Valid_Parentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_32_Longest_Valid_Parentheses o = new _32_Longest_Valid_Parentheses();
		String s=")()())";
		int ret = o.longestValidParentheses(s);
		System.out.println(ret);
	}
	 public int longestValidParentheses(String s) {
	        int maxans = 0;
	        Stack<Integer> stack = new Stack<>();
	        stack.push(-1);
	        for (int i = 0; i < s.length(); i++) {
	            if (s.charAt(i) == '(') {
	                stack.push(i);
	            } else {
	                stack.pop();
	                if (stack.empty()) {
	                    stack.push(i);
	                } else {
	                    maxans = Math.max(maxans, i - stack.peek());
	                }
	            }
	        }
	        return maxans;
	    }

}

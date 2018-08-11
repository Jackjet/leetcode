package leetcode;

import java.util.Stack;

public class _20_Valid_Parentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_20_Valid_Parentheses o =new _20_Valid_Parentheses();
		String string[] ={"()","([)]","]","()[]{}","([]){}"};
		for(int i = 0;i<string.length;i++){
			System.out.println(o.isValid(string[i]));
		}
	}
	public boolean isValid(String s) {

        Stack<Character> stack = new Stack<Character>();
        for(char c:s.toCharArray()){
        	if(c=='(')stack.push(')');
            else if(c=='[')stack.push(']');
            else if(c=='{')stack.push('}');
            else if(stack.isEmpty() || c!=stack.pop()){
                return false;
            }
            
        }
        return stack.isEmpty();
    }

}

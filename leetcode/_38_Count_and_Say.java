package leetcode;
/*
 * The count-and-say sequence is the sequence of integers with the first five terms as following:

1.     1
2.     11
3.     21
4.     1211
5.     111221
1 is read off as "one 1" or 11.
11 is read off as "two 1s" or 21.
21 is read off as "one 2, then one 1" or 1211.
Given an integer n, generate the nth term of the count-and-say sequence.

Note: Each term of the sequence of integers will be represented as a string.

Example 1:

Input: 1
Output: "1"
Example 2:

Input: 4
Output: "1211"
 */
public class _38_Count_and_Say {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_38_Count_and_Say o =new _38_Count_and_Say();
		String ret= o.countAndSay(1);
		System.out.println(ret);
	}
	 public String countAndSay(int n) {
	        String str="1";
	        if(n<=0)return "";
	        else if(n==1)return "1";
	        else{
	           for(int i=1;i<n;i++){
	               str= solve(str);
	               
	           }
	            
	        }
	        return str;
	        
	    }
	    public String solve(String str){
	        String ret="";
	        for(int i = 0;i<str.length();i++){
	            int count=1;
	            while(i+1<str.length() && str.charAt(i)==str.charAt(i+1)){
	                i++;
	                count++;
	            }
	            ret+=count+""+str.charAt(i);
	           
	            
	        }
	        return ret;
	    }

}

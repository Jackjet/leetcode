package leetcode;
/*
 * Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai). n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). Find two lines, which together with x-axis forms a container, such that the container contains the most water.

Note: You may not slant the container and n is at least 2.

 



The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.

 

Example:

Input: [1,8,6,2,5,4,8,3,7]
Output: 49
 */
public class _11_Container_With_Most_Water {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_11_Container_With_Most_Water o = new _11_Container_With_Most_Water();
		int[] height={1,8,6,2,5,4,8,3,7};
		int ret =o.maxArea(height);
		System.out.println(ret);
	}
	public int maxArea(int[] height){
		int len =height.length;
		if(len<=1) return 0;
		int ret= 0;
		int i =0,j =len-1;
		while(i<j){
			int temp =(j-i)*Math.min(height[i], height[j]);
			ret=  ret>temp?ret:temp;
			if(height[i]>height[j])j--;
			else i++;
			
		}
		return ret;
	}
}

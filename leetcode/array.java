package leetcode;

public class array {
	public void cout(int[] nums){
		for(int i =0;i<nums.length;i++){
			System.out.println(nums[i]);
		}
	}
	public void charchar_cout(char[][] nums){
		for(int i =0;i<nums.length;i++){
			for(int j = 0;j<nums[i].length;j++){
				System.out.print(nums[i][j]+"\t");
			}
			System.out.println();
		}
	}
}

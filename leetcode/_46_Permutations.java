package leetcode;
import java.util.*;
/*
 * Given a collection of distinct integers, return all possible permutations.

Example:

Input: [1,2,3]
Output:
[
  [1,2,3],
  [1,3,2],
  [2,1,3],
  [2,3,1],
  [3,1,2],
  [3,2,1]
]
 */
public class _46_Permutations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_46_Permutations o = new _46_Permutations();
		int[] nums  = {1,2,3};
		List<List<Integer>> ret = o.permute(nums);
		System.out.println(ret);
	}
	public List<List<Integer>> permute(int[] nums){
		List<List<Integer>> list = new ArrayList<>();
		backstrack(list, new ArrayList(), nums);
		return list;
	}
	private void backstrack(List<List<Integer>> list, List<Integer> tempList, int[] nums){
		if (tempList.size()==nums.length){
			list.add(new ArrayList(tempList));
		} else{
			for (int i =0; i<nums.length; i++){
				
				if(tempList.contains(nums[i])) continue;
				System.out.println(nums[i]);
				tempList.add(nums[i]);
				backstrack(list, tempList, nums);
				tempList.remove(tempList.size() - 1);
			}
		}
	}

}

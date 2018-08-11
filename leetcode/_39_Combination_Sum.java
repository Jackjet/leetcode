package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Given a set of candidate numbers (candidates) (without duplicates) and a target number (target), find all unique combinations in candidates where the candidate numbers sums to target.

The same repeated number may be chosen from candidates unlimited number of times.

Note:

All numbers (including target) will be positive integers.
The solution set must not contain duplicate combinations.
Example 1:

Input: candidates = [2,3,6,7], target = 7,
A solution set is:
[
  [7],
  [2,2,3]
]
Example 2:

Input: candidates = [2,3,5], target = 8,
A solution set is:
[
  [2,2,2,2],
  [2,3,3],
  [3,5]
]
 */
public class _39_Combination_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_39_Combination_Sum o = new _39_Combination_Sum();
		int candidates[]={2,3,5};
		int target = 8;
		List<List<Integer>> ret = o.combinationSum(candidates, target);
		System.out.println(ret);
	}
	 public List<List<Integer>> combinationSum(int[] candidates, int target) {
	    	Arrays.sort(candidates);
	        List<List<Integer>> result = new ArrayList<List<Integer>>();
	        getResult(result, new ArrayList<Integer>(), candidates, target, 0);
	        
	        return result;
	    }
	    
	    private void getResult(List<List<Integer>> result, List<Integer> cur, int candidates[], int target, int start){
	    	if(target > 0){
	    		for(int i = start; i < candidates.length && target >= candidates[i]; i++){
	    			cur.add(candidates[i]);
	    			getResult(result, cur, candidates, target - candidates[i], i);
	    			cur.remove(cur.size() - 1);
	    		}//for
	    	}//if
	    	else if(target == 0 ){
	    		result.add(new ArrayList<Integer>(cur));
	    	}//else if
	    }

}

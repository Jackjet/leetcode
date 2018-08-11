package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Given a collection of candidate numbers (candidates) and a target number (target), find all unique combinations in candidates where the candidate numbers sums to target.

Each number in candidates may only be used once in the combination.

Note:

All numbers (including target) will be positive integers.
The solution set must not contain duplicate combinations.
Example 1:

Input: candidates = [10,1,2,7,6,1,5], target = 8,
A solution set is:
[
  [1, 7],
  [1, 2, 5],
  [2, 6],
  [1, 1, 6]
]
Example 2:

Input: candidates = [2,5,2,1,2], target = 5,
A solution set is:
[
  [1,2,2],
  [5]
]
 */
public class _40_Combination_Sum_II {
	public static void main(String[] args){
		_40_Combination_Sum_II o = new _40_Combination_Sum_II();
		int candidates[]={10,1,2,7,6,1,5};
		int target= 8;
		List ret= o.combinationSum2(candidates, target);
		System.out.println(ret);
	}
	
	public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> list = new ArrayList();
        sovle(list,new ArrayList<Integer>(),candidates,target,0);
        return list;
    }
    public void sovle(List<List<Integer>> list, List<Integer> cur,int[] candidates,int target,int index){
        if(target>0){
            for(int i =index;i<candidates.length;i++){
                cur.add(candidates[i]);
                sovle(list,cur,candidates,target-candidates[i],i+1);
                cur.remove(cur.size()-1);
            }
        }
        else if(target==0){
            List<Integer> curr= new ArrayList<Integer>(cur);
            if(!list.contains(curr))
                list.add(curr);
        }
    }
}

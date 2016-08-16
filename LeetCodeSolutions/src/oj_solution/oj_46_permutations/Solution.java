package oj_solution.oj_46_permutations;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		if(null == nums){
			res.add(new ArrayList<Integer>());
			return res;
		}
		getPermute(nums, 0, res);
		return res;
    }
	
	private void getPermute(int[] nums, int start, List<List<Integer>> res){
		if(start == nums.length - 1){
			List<Integer> curRes = new ArrayList<Integer>();
			for(int i = 0; i <= start; i++){
				curRes.add(nums[i]);
			}
			res.add(curRes);
		} else {
			for(int i = start; i < nums.length; i++){
				swap(nums, i, start);
				getPermute(nums, start+1, res);
				swap(nums, i, start);
			}
		}
	}
	
	private void swap(int[] nums, int i, int j){
		int tmp = nums[i];
		nums[i] = nums[j];
		nums[j] = tmp;
	}
	
	
}

package com.solutions;

import java.util.HashMap;

/**
 * @author lyenliang
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(n)        
 */
public class TwoSum2 {
	public int[] twoSum(int[] nums, int target) {
		// Create a HashMap that maps each element to its index.
		HashMap<Integer, Integer> indicesHm = new HashMap<Integer, Integer>();
		for(int i = 0; i < nums.length; ++i) {
			indicesHm.put(nums[i], i+1);
		}
		
		// For each element `num` in nums, check whether `target - num` also exists in the input array. 
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for(int num : nums) {
			hm.put(target - num, num);
		}
		for(int i = 0; i < nums.length; ++i) {
			if(hm.get(nums[i]) != null ) {
				int idx1 = i+1;
				int idx2 = indicesHm.get(hm.get(nums[i]));
				// one element shouldn't be counted twice
				if(idx1 != idx2) {
					return new int[]{idx1, idx2};
				}
			}
		}
		return null;
	}

	public static void main(String[] args) {
		TwoSum2 ts = new TwoSum2();
		int[] nums = { -1,-2,-3,-4,-5 };
		int target = -8;
		int[] result = ts.twoSum(nums, target);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
	}
}

package com.solutions;

import java.util.HashMap;

/**
 * @author lyenliang
 * 
 * Time Complexity: O(n) 
 * Space Complexity: O(n)
 * 
 * This is an improved version of TwoSum2.java
 */
public class TwoSum3 {
	public int[] twoSum(int[] nums, int target) {
		// We don't have to create a HashMap that maps each element to its index
		// anymore.
		int length = nums.length;
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for (int i = 0; i < length; i++) {
			if (!hm.containsKey(nums[i])) {
				hm.put(target - nums[i], i);
			} else {
				return new int[] { hm.get(nums[i]) + 1, i + 1 };
			}
		}
		return null;
	}

	public static void main(String[] args) {
		TwoSum3 ts = new TwoSum3();
		int[] nums = { 2, 1, 9, 4, 4, 56, 90, 3 };
		int target = 8;
		int[] result = ts.twoSum(nums, target);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
	}
}

package com.solutions;

/**
 * @author lyenliang
 * 
 * Brute Force Solution
 * Time Complexity: O(n^2)
 * Space Complexity: O(1)
 */
public class TwoSum {
	// for each pair of elements in nums check whether there is any element whose sum is target
	public int[] twoSum(int[] nums, int target) {
		for (int i = 0; i < nums.length; ++i) {
			for (int j = i + 1; j < nums.length; ++j) {
				if (nums[i] + nums[j] == target) {
					return new int[] { i + 1, j + 1 };
				}
			}
		}
		return null;
	}

	public static void main(String[] args) {
		TwoSum ts = new TwoSum();
		int[] nums = { 2, 1, 9, 4, 4, 56, 90, 3 };
		int target = 8;
		int[] result = ts.twoSum(nums, target);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
	}
}

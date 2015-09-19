package com.solutions;

import java.util.Arrays;

public class ThreeSumClosest {

	public int threeSumClosest(int[] nums, int target) {
		Arrays.sort(nums);
		int i = 0, j = 1, k = nums.length - 1;
		int tmpSum = 0;
		int sum = nums[i] + nums[j] + nums[k];
		for (i = 0; i < nums.length - 2; ++i) {
			j = i + 1;
			k = nums.length - 1;
			while (j < k) {
				tmpSum = nums[i] + nums[j] + nums[k];
				if (tmpSum > target) {
					--k;
				} else {
					++j;
				}
				if (Math.abs(tmpSum - target) < Math.abs(sum - target)) {
					sum = tmpSum;
				}
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 2, 4, 8, 16, 32, 64, 128 };
		int target = 82;
		ThreeSumClosest tsc = new ThreeSumClosest();
		System.out.println(tsc.threeSumClosest(nums, target));
	}
}

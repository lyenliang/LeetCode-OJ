package com.solutions;

public class TwoSum {
	public int[] twoSum(int[] nums, int target) {
		for(int i = 0 ; i < nums.length-1 ; i++) {
        	for(int j = i+1 ; j < nums.length ; j++) {
        		if(nums[i] + nums[j] == target) {
        			int[] result = new int[2];
        			result[0] = i < j ? (i+1) : (j+1);
        			result[1] = i > j ? (i+1) : (j+1);
        			return result;
        		}
        	}
        }
		return null;
    }
	
	public static void main(String[] args) {
		TwoSum ts = new TwoSum();
		int[] nums = {2,1,9,4,4,56,90,3};
		int target = 8;
		int[] result = ts.twoSum(nums, target);
		for(int i = 0 ; i < result.length ; i++) {
			System.out.print(result[i] + " ");
		}
	}
}

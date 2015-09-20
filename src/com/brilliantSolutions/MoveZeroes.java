package com.solutions;

import java.util.ArrayList;
import java.util.List;

/**
 * @see https://leetcode.com/discuss/59218/simple-solution
 *
 */
public class MoveZeroes {
	
	private void swap(int[] nums, int i, int j) {
		int tmp = nums[i];
		nums[i] = nums[j];
		nums[j] = tmp;
	}
	
	public void moveZeroes(int[] nums) {
		int cur = 0;
	    for(int i=0; i < nums.length; i++)
	        if(nums[i] != 0) {
	        	swap(nums, i, cur++);
	        }
	}
	
	public static void main(String[] args) {
		int nums[] = {0,1,0,3,12};
		MoveZeroes mz = new MoveZeroes();
		mz.moveZeroes(nums);
	}
}

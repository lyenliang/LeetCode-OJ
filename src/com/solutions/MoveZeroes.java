package com.solutions;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lyenliang
 *
 */
public class MoveZeroes {
	
	private void shiftLeft(int[] nums, int start) {
		for(int i = start; i < nums.length-1; ++i) {
			nums[i] = nums[i+1];
		}
		nums[nums.length-1] = 0;
	}
	
	public void moveZeroes(int[] nums) {
		int lastNonZeroIdx = 0;
		List<Integer> zeroList = new ArrayList<Integer>();
		
		for (int i = 0; i < nums.length; ++i) {
			if(nums[i] != 0) {
				lastNonZeroIdx = i;
			}
		}
		
		for (int i = 0; i < lastNonZeroIdx; ++i) {
			if(nums[i] == 0) {
				zeroList.add(i);
			}
		}
		
		int adjust = 0;
		for (int i = 0; i < zeroList.size(); ++i) {
			shiftLeft(nums, zeroList.get(i)-adjust);
			++adjust;
		}
	}
	
	public static void main(String[] args) {
		int nums[] = {0,1,0,3,12};
		MoveZeroes mz = new MoveZeroes();
		mz.moveZeroes(nums);
	}
}

package com.solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author lyenliang
 * The algorithm here is pretty similar to the one used in 3Sum
 */
public class FourSum {
	public List<List<Integer>> fourSum(int[] nums, int target) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		if(nums == null || nums.length < 4) return result;
        Arrays.sort(nums);
        int i = 0, j = 1, k = 2, l = nums.length-1;
        int tmpSum = 0;
        for(i = 0 ; i < nums.length - 3 ; ++i) {
        	for(j = i+1 ; j < nums.length - 2 ; ++j) {
        		k = j + 1;
        		l = nums.length - 1;
        		while(k < l) {
        			tmpSum = nums[i] + nums[j] + nums[k] + nums[l];
        			if(tmpSum < target) {
        				++k;
        			} else if(tmpSum > target){
        				--l;
        			} else {
        				List<Integer> match = new ArrayList<Integer>(4);
        				match.add(nums[i]);
        				match.add(nums[j]);
        				match.add(nums[k]);
        				match.add(nums[l]);
        				if(!result.contains(match)) {
        					result.add(match);
        				}
        				++k;
        				--l;
        			}
        			
        		}
        	}
        }
        return result;
    }
}

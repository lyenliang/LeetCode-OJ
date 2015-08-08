package com.solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
	public List<List<Integer>> threeSum(int[] nums) {
		int length = nums.length;
		List<List<Integer>> solutions = new ArrayList<List<Integer>>();
		if(length < 3) return solutions;
        Arrays.sort(nums);
        for(int i = 0 ; i < length ; ++i) {
        	int j = i+1;
        	int k = length - 1;
        	while(j < k ) {
        		int sum = nums[i] + nums[j] + nums[k];
        		if(sum < 0) {
    				++j;
        		} else if(sum > 0) {
    				--k;
        		} else {
        			List<Integer> solution = new ArrayList<Integer>();
        			solution.add(nums[i]);
        			solution.add(nums[j]);
        			solution.add(nums[k]);
        			if(!solutions.contains(solution)) {
        				solutions.add(solution);
        			}
    				++j;
    				--k;
    				while(j < k && nums[j] == nums[j-1]){
                        ++j;
                    }
                    while(j < k && nums[k] == nums[k+1]){
                        --k;
                    }
        		}
        	}
        }
        return solutions;
    }
	
	public static void main(String[] args) {
		ThreeSum ts = new ThreeSum();
		int[] nums = new int[]{-2,0,1,1,2};
		ts.threeSum(nums);
	}
}

package com.solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
	public List<List<Integer>> threeSum(int[] nums) {
	    List<List<Integer>> solutions = new ArrayList<List<Integer>>();
	    Arrays.sort(nums);
	    int i = 0, last = nums.length - 1;
	    while (i < last) {
	        int a = nums[i], j = i+1, k = last;
	        while (j < k) {
	            int b = nums[j];
	            int c = nums[k];
	            int sum = a+b+c;
	            if (sum == 0) {
	            	solutions.add(Arrays.asList(a, b, c));
	            }
	            if (sum <= 0) {
	            	// sum == 0 also goes here
	            	while (nums[j] == b && j < k) { 
	            		++j;
	            	} 
	            }
	            if (sum >= 0) {
	            	// sum == 0 also goes here
	            	while (nums[k] == c && j < k) {
	            		--k;
	            	}
	            }
	        }
	        while (nums[i] == a && i < last) ++i;
	    }
	    return solutions;
	}
	
	public static void main(String[] args) {
		ThreeSum ts = new ThreeSum();
		int[] nums = new int[]{0,0,0};
		ts.threeSum(nums);
	}
}

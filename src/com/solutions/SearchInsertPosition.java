package com.solutions;

/**
 * @author lyenliang
 *
 */
public class SearchInsertPosition {
	public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int midIdx = 0;
        while(left <= right && left >= 0 && right < nums.length) {
        	midIdx = (left + right) / 2;
	        if(nums[midIdx] == target) {
	        	return midIdx;
	        } else if(nums[midIdx] < target) {
	        	left = midIdx + 1;
	        } else if(nums[midIdx] > target) {
	        	right = midIdx - 1;
	        }
        }
        // unable to find target
        if(left >= nums.length) {
        	return nums.length;
        }
        if(right < 0) {
        	return 0;
        }
        if(nums[midIdx] < target) {
        	return midIdx + 1;
        }
        // now must be the case where nums[midIdx] > target
        return midIdx;
    }
	
	public static void main(String[] args) {
		SearchInsertPosition sip = new SearchInsertPosition();
		int[] nums = {1,3,5};
		int target = 2;
		int idx = sip.searchInsert(nums, target);
		System.out.println(idx);
	}
}

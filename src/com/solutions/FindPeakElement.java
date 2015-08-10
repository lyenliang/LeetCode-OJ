package com.solutions;

/**
 * @author Yen_Lee
 *
 */
public class FindPeakElement {
	public int findPeakElement(int[] nums) {
        if(nums == null) return -1;
        if(nums.length == 1) return 0;
        int l = 0;
        int r = nums.length - 1;
        int mid = (l + r) / 2;
        while(true) {
        	if(mid-1 >= 0 && mid+1 < nums.length && nums[mid-1] <= nums[mid] && nums[mid] >= nums[mid+1]) {
        		return mid;
        	}
        	if(mid-1 >= 0 && nums[mid-1] > nums[mid]) {
        		r = mid - 1;
        	} else if(mid+1 < nums.length && nums[mid+1] > nums[mid]) {
        		l = mid + 1;
        	}
        	mid = (l + r) / 2;
        	// nums.length == 1 is filtered at the beginning of the program
        	if((mid == 0 && nums[mid+1] <= nums[mid]) || 
        			(mid == nums.length-1 && nums[mid-1] <= nums[mid])) {
        		return mid;
        	}
        }
    }
	public static void main(String[] args) {
		FindPeakElement fpe = new FindPeakElement();
		int[] nums = {1};
		int idx = fpe.findPeakElement(nums);
		System.out.println(idx);
	}
}

package com.solutions;

/**
 * @author lyenliang
 * 
 *         Suppose a sorted array is rotated at some pivot unknown to you
 *         beforehand. You are given a target value to search. If found in the
 *         array return its index, otherwise return -1. You may assume no
 *         duplicate exists in the array.
 * Time Complexity: O(logn)
 * Space Complexity: O(1)
 */
public class SearchInRotatedSortedArray {
	public int search(int[] nums, int target) {
		int end = nums.length - 1;
		int pivot = findPivot(nums, 0, end);
		// apply binary search to one of the sub-arrays
		if(pivot == end) {
			// pivot is the right most index
			return binarySearch(nums, 0, end, target);
		} else {
			if(nums[0] <= target && target <= nums[pivot]) {
				return binarySearch(nums, 0, pivot, target);
			} else if(nums[pivot+1] <= target && target <= nums[end]) {
				return binarySearch(nums, pivot+1, end, target);
			} else {
				return -1;
			}
		}
	}
	
	/** 
	 * 
	 * @return the index of the pivot
	 * T(n) = T(n/2) + c, where c is a constant time.
	 * According to master theorem, running time is O(logn) 
	 */
	private int findPivot(int[] nums, int start, int end) {
		if(start == end) {
			return start;
		} else if (end - start == 1) {
			return nums[start] > nums[end] ? start : end;
		} else {
			int mid = start + (end-start)/2;
			if(nums[start] <= nums[mid]) {
				return findPivot(nums, mid, end);
			} else {
				return findPivot(nums, start, mid);
			}
		}
	}
	
	private int binarySearch(int[] nums, int start, int end, int target) {
		while(start <= end) {
			int mid = start + (end - start)/2;
			if(nums[mid] == target) {
				return mid;
			} else if(target < nums[mid]) {
				end = mid - 1;
			} else {
				// target > nums[mid]
				start = mid + 1;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		SearchInRotatedSortedArray sirsa = new SearchInRotatedSortedArray();
		int[] aa = new int[]{5,6,7,8,9,1,2,3,4};
		System.out.println(sirsa.search(aa, 6));
	}
}

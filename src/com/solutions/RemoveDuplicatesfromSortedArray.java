package com.solutions;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lyenliang
 *
 */
public class RemoveDuplicatesfromSortedArray {
	public int removeDuplicates(int[] nums) {
        int length = nums.length;
        if(length == 0 || length == 1) return length;
		int p1 = 0;
		int p2 = 1;
        int lenCount = 1;
        List<Integer> list = new ArrayList<Integer>();
        list.add(nums[0]);
		for(; p2 < nums.length ; ++p1, ++p2) {
        	if(nums[p1] != nums[p2]) {
        		++ lenCount;
        		list.add(nums[p2]);
        	}
        }
		for(int i = 0 ; i < list.size() ; ++i) {
			nums[i] = list.get(i);
		}
		return lenCount;
    }
}

package com.solutions;

/**
 * @author lyenliang
 *
 */
public class RemoveDuplicatesfromSortedArray {
	public int removeDuplicates(int[] nums) {
        int length = nums.length;
        if(length == 0 || length == 1) return length;
        int i=0, j=1;
        while(j < length){
            if(nums[i] == nums[j]) {
            	// go until a different value is found
            	++j;
            } else {
                ++i; // move i to the number to be replaced 
                nums[i] =nums[j];
                ++j;
            }
        }
        return ++i;
    }
	
	public static void main(String[] args) {
		RemoveDuplicatesfromSortedArray rdsa = new RemoveDuplicatesfromSortedArray();
		int[] nums = {1,1,1,2,3,3};
		int length = rdsa.removeDuplicates(nums);
		System.out.println(length);
	}
}

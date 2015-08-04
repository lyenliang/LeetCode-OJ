package com.solutions;

public class TwoSum {
	// you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        // convert to unsigned int
        long num = n & 0x00000000ffffffffL;
        int count = 0;
        while(num > 0) {
            count += (num % 2);
            num /= 2;
        }
        return count;
    }
}

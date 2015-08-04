package com.solutions;

public class ReverseBits {
	// you need treat n as an unsigned value
    public int reverseBits(int n) {
        long num = n & 0x00000000FFFFFFFFL;
        long result = 0;
        for(int i = 0 ; i < 32 ; ++i) {
        	result = (result << 1) | (num & 1);
        	num >>= 1;
        }
        return (int) result;
    }
    
    public static void main(String[] args) {
    	ReverseBits rb = new ReverseBits();
    	System.out.println(rb.reverseBits(11));
    }
}

package com.solutions;

/**
 * @author lyenliang
 *
 */
public class UglyNumber {
	public boolean isUgly(int num) {
        if(num == 1) return true;
        if(num <= 0) return false;
        int[] primes = {2, 3, 5};
        for(int p : primes) {
	        while(num % p == 0) {
	        	num /= p;
	        }
        }
        if(num == 1) {
        	return true;
        }
        return false;
    }
	
	public static void main(String[] args) {
		UglyNumber un = new UglyNumber();
		System.out.println(un.isUgly(14));
	}
}

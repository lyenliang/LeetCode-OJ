package com.solutions;

/**
 * 
 * Given an integer n, return the number of trailing zeroes in n!.
 * Note: Your solution should be in logarithmic time complexity.
 *
 */

public class FactorialTrailingZeroes {
	
    private int sumMinus(int numOf5s) {
        int result = 0;
        for(int i = 1; i < numOf5s ; i++) {
            result += i;
        }
        return result;
    }

    private int getNumof5s(int num) {
        int count = 0;
        while(num > Math.pow(5, count)) {
        	count ++;
        }
        return count - 1;
    }

    public int trailingZeroes(int n) {
        if (n == 0 ) return 0;
        int numOf5s = getNumof5s(n);
        int extra = sumMinus(numOf5s);
        return (n / 5) + extra;
    }
    
	public static void main(String[] args) {
		FactorialTrailingZeroes s = new FactorialTrailingZeroes();
		System.out.println(s.trailingZeroes(50));
	}
}
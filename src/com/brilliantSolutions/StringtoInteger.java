package com.solutions;

/**
 * @author yuruofeifei
 * @see https://leetcode.com/discuss/8886/my-simple-solution
 * This code is originally written in C
 */
public class StringtoInteger {
	public int myAtoi(String str) {
		int sign = 1, base = 0, i = 0;
	    while (str.charAt(i) == ' ') { i++; }
	    if (str.charAt(i) == '-' || str.charAt(i) == '+') {
	        sign = 1 - 2 * (str.charAt(i++) == '-' ? 1 : 0); 
	    }
	    while (i < str.length() && str.charAt(i) >= '0' && str.charAt(i) <= '9' ) {
	        if ((base >  Integer.MAX_VALUE / 10) || ((base == Integer.MAX_VALUE / 10) && (str.charAt(i) - '0' > 7))) {
	            if (sign == 1) return Integer.MAX_VALUE;
	            else return Integer.MIN_VALUE;
	        }
	        base  = 10 * base + (str.charAt(i++) - '0');
	    }
	    return base * sign;
    }
	public static void main(String[] args) {
		StringtoInteger atoi = new StringtoInteger();
		System.out.println(atoi.myAtoi("-2147483648"));
	}
}

package com.solutions;

/**
 * @author lyenliang
 *
 */
public class StringtoInteger {
	public int myAtoi(String str) {
		if(str == null || str.length() == 0) return 0;
		// discard white space
		str = str.trim();
		boolean hasSign = false;
		int i = 0;
		if(str.charAt(0) == '+' || str.charAt(0) == '-') {
			i = 1;
			hasSign = true;
		} 
		while(i < str.length()) {
			if((str.charAt(i) - '0' > 9) || (str.charAt(i) - '0' < 0 )) {
				break;
			}
			++i;
		}
		// determine if str is invalid
		if((i == 1 && hasSign) || (i == 0)) {
			return 0;
		}
		str = str.substring(0, i);
		long longRet = 0;
		try {
			longRet = Long.valueOf(str);
		} catch(NumberFormatException e) {
			if(str.charAt(0) == '-') {
				return Integer.MIN_VALUE;
			} else {
				return Integer.MAX_VALUE;
			}
		}
		if(longRet > Integer.MAX_VALUE) {
			return Integer.MAX_VALUE;
		} else if (longRet < Integer.MIN_VALUE){
			return Integer.MIN_VALUE;
		} else {
			return (int)longRet;
		}
    }
	public static void main(String[] args) {
		StringtoInteger atoi = new StringtoInteger();
		System.out.println(atoi.myAtoi("+5"));
	}
}

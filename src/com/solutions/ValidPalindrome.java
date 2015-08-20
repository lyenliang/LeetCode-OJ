package com.solutions;

/**
 * @author lyenliang
 *
 */
public class ValidPalindrome {
	
	private boolean isValidChar(char c) {
		// check whether c is an alphanumeric character or not
		int a2z = c-'a';
		int zero2nine = c-'0';
		if((0 <= a2z && a2z <= 25) || (0 <= zero2nine && zero2nine <= 9)) {
			return true;
		}
		return false;
	}
	
	public boolean isPalindrome(String s) {
		// convert to lower case in order to ignore case
		s = s.toLowerCase();
        int begin = 0;
        int end = s.length()-1;
        while(begin < end) {
        	while(!isValidChar(s.charAt(begin)) && begin < s.length()-1) {
        		++begin;
        	}
        	while(!isValidChar(s.charAt(end)) && end > 0) {
        		--end;
        	}
        	if(begin < end && s.charAt(begin++) != s.charAt(end--)) {
        		return false;
        	}
        }
        return true;
    }
	
	public static void main(String[] args) {
		ValidPalindrome vp = new ValidPalindrome();
		String s = "aaAA";
		System.out.println(vp.isPalindrome(s));
	}
}

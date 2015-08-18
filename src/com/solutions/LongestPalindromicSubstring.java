package com.solutions;

/**
 * @author Yen_Lee
 *
 */
public class LongestPalindromicSubstring {
	public String longestPalindrome(String s) {
		int length = s.length();
		// special cases
		if(length < 2 ) return s;
		
		// brute force solution
		String ret = String.valueOf(s.charAt(0));
        for(int mid = 0 ; mid < length && ret.length()/2 < length-mid ; ++mid) {
            int l = mid;
            int r = mid;
            String tmp = String.valueOf(s.charAt(mid));
        	while(l > 0 && r < length-1 && s.charAt(l) == s.charAt(r)) {
        		tmp = s.charAt(l) + tmp + s.charAt(r);
	        	--l;
	        	++r;
	        }
        	if(tmp.length() > ret.length()) {
        		ret = tmp;
        	}
        }
        return ret;
    }
	
	public static void main(String[] args) {
		LongestPalindromicSubstring lps = new LongestPalindromicSubstring();
		System.out.println(lps.longestPalindrome("aaabbbbb"));
	}
}

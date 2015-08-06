package com.solutions;

/**
 * @author lyenliang
 *
 */
public class ZigZagConversion {
	
	public String convert(String s, int numRows) {
		if(numRows == 1) return s;
		int period = 2 * numRows - 2;
		StringBuilder ret = new StringBuilder();
		for(int i = 0 ; i < numRows ; ++i) {
			if(i >= s.length()) break;
			int j = i;
			ret.append(s.charAt(j));
			while(j < s.length()) {
				
				j += (period - 2*i);
				if((period - 2*i) > 0 && j < s.length()) {
					ret.append(s.charAt(j));
				}
				
				j += 2*i;
				if(2*i > 0 && j < s.length()) {
					ret.append(s.charAt(j));
				}
				
			}
		}
		return ret.toString();
    }
	
	public static void main(String[] args) {
		ZigZagConversion zzc = new ZigZagConversion();
		String result = zzc.convert("ABCD", 4);
		System.out.println(result);
	}
}

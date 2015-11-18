package com.solutions;

/**
 * @author lyeliang
 *
 */
public class CountAndSay {
	public String countAndSay(int n) {
        if(n == 1) {
        	return "1";
        }
        String out = "1";
        for(int i = 1 ; i < n ; ++i) {
        	out = subCountAndSay(out);
        }
        return out;
    }
	
	private String subCountAndSay(String in) {
		if(in.equals("1")) {
			return "11";
		}
		StringBuilder result = new StringBuilder("");
		int i = 1;
		int count = 1;
		while(i <= in.length()) {
			if(i == in.length() || in.charAt(i) != in.charAt(i-1) ) {
				result.append(count);
				result.append(in.charAt(i-1));
				count = 1;
			} else {
				count++;
			}
			i++;
		}
		return result.toString();
	}
	
	public static void main(String[] args) {
		CountAndSay cs = new CountAndSay();
		System.out.println(cs.countAndSay(3));
	}
}

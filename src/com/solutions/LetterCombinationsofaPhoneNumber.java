package com.solutions;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationsofaPhoneNumber {
	List<String> result = null;
	String[] map = new String[]{" ", "_", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
	List<String> tmp = null;
	private void subLetterCombinations(String digits, int idx) {
		if(idx >= digits.length()) {
			return;
		} else {
			int digit = digits.charAt(idx) - '0';
			List<String> tmp = new ArrayList<String>();
			for(int j = 0 ; j < map[digit].length() ; ++j) {
				for(int i = 0 ; i < result.size() ; ++i) {
					tmp.add(result.get(i) + map[digit].charAt(j));
				}
			}
			result = new ArrayList<String>(tmp);
			subLetterCombinations(digits, idx + 1);
		}
	}
	
	public List<String> letterCombinations(String digits) {
        if(digits == null || digits.length() == 0 )
        	return new ArrayList<String>();
        result = new ArrayList<String>();
        result.add("");
        subLetterCombinations(digits, 0);
        return result;
    }
	
	public static void main(String[] args) {
		LetterCombinationsofaPhoneNumber lcpn = new LetterCombinationsofaPhoneNumber();
		List<String> result = lcpn.letterCombinations("234");
		for(int i = 0 ; i < result.size() ; ++i) {
			System.out.print(result.get(i) + ", ");
		}
	}
}

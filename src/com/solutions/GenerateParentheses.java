package com.solutions;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
	
	public static void main(String[] args) {
		GenerateParentheses gp = new GenerateParentheses();
		System.out.println(gp.generateParenthesis(3));
	}
	
	public List<String> generateParenthesis(int n) {
		/* 
		 * 1. We can have up to n "("s.
		 * 2. We can place a ")" if there exists a "(".
		 */
        List<String> ret = new ArrayList<String>();
        StringBuilder sb = new StringBuilder();
        recursiveParenthesis(n, ret, 0, 0, sb);
        return ret;
    }
	
	private void recursiveParenthesis(int n, List<String> ret, int curLeft, int curRight, StringBuilder sb) {
		
		if(sb.length() == 2*n) {
			ret.add(sb.toString());
			return;
		}
		if(curLeft < n) {
			sb.append("(");
			recursiveParenthesis(n, ret, curLeft+1, curRight, sb);
			sb.setLength(sb.length()-1);
		}
		if(curRight < curLeft) {
			sb.append(")");
			recursiveParenthesis(n, ret, curLeft, curRight+1, sb);
			sb.setLength(sb.length()-1);
		}
	}
}

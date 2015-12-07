package com.solutions;

import java.util.Stack;

/**
 * @author Yen_Lee
 *
 */
public class SimplifyPath {
	public String simplifyPath(String path) {
		Stack<String> resultStack = new Stack<String>();
        String[] tokens = path.split("/");
        // put all the directory names into a stack
        for(String token : tokens) {
        	if(token.equals("..")) {
        		if(!resultStack.isEmpty()) {
        			resultStack.pop();
        		} 
        	} else if (token.equals(".") || token.equals("")) {
        		continue;
        	} else {
        		resultStack.push(token);
        	}
        }
        
        StringBuilder result = new StringBuilder();
        Stack<String> reverseStack = new Stack<String>();
        
        // reverse the stack so that the order of the directories is correct
        while(!resultStack.isEmpty()) {
        	reverseStack.push(resultStack.pop());
        }
        // start building the final result
        result.append("/");
        while(!reverseStack.isEmpty()) {
        	result.append(reverseStack.pop()).append("/");
        }
        if(result.length() > 1) {
        	result.deleteCharAt(result.length()-1);
        }
        return result.toString();
    }
	
	public static void main(String[] args) {
		SimplifyPath sp = new SimplifyPath();
		String path = "/..";
		String result = sp.simplifyPath(path);
		System.out.println(result);
	}
}

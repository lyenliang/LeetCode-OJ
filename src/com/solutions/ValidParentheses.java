package com.solutions;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author lyenliang
 *
 */
public class ValidParentheses {
	Stack<Character> stack = new Stack<Character>();
	List<Character> leftList = new ArrayList<Character>();
	List<Character> rightList = new ArrayList<Character>();
	private void init() {
		leftList.add('(');
		leftList.add('{');
		leftList.add('[');
		
		rightList.add(')');
		rightList.add('}');
		rightList.add(']');
	}
	
	private boolean sameSide(char s1, char s2) {
		return (leftList.contains(s1) && leftList.contains(s2)) || 
				(rightList.contains(s1) && rightList.contains(s2));
	}
	
	private boolean match(char s1, char s2) {
		// make sure that s1 and s2 are two different sides before you put parameters in match()
		if(!leftList.contains(s1)) {
			// guarantee that s1 belongs to left, s2 belongs to right
			char tmp = s1;
			s1 = s2;
			s2 = tmp;
		}
		if(s1 == '(') {
			return s2 == ')';
		} else if(s1 == '{') {
			return s2 == '}';
		} else if(s1 == '[') {
			return s2 == ']';
		} else {
			return false;
		}
	}
	
	public boolean isValid(String s) {
		init();
        for(int i = 0 ; i < s.length() ; ++i) {
        	if(stack.isEmpty()) {
        		stack.push(s.charAt(i));
        		continue;
        	}
        	char c = stack.peek();
        	if(sameSide(c, s.charAt(i))){
        		stack.push(s.charAt(i));
        	} else {
        		if(match(c, s.charAt(i))) {
        			stack.pop();
        		} else {
        			return false;
        		}
        	}
        }
        // the stack should be empty after the for loop
        if(stack.isEmpty()) {
        	return true;
        } 
        return false;
    }
	public static void main(String[] args) {
		ValidParentheses vp = new ValidParentheses();
		boolean isValid = vp.isValid("[()()]");
		System.out.println(isValid);
	}
	
}

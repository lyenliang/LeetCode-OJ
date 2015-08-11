package com.solutions;

import java.util.HashSet;

/**
 * @author lyenliang
 *
 */
public class ValidSudoku {
	public boolean isValidSudoku(char[][] board) {
        int rowLen = 9;
        int colLen = 9;
        // check rows and columns
        HashSet<Character> rowCheck;
        HashSet<Character> colCheck;
        for(int i = 0 ; i < rowLen ; ++i) {
        	rowCheck = new HashSet<Character>();
        	colCheck = new HashSet<Character>();
        	for(int j = 0 ; j < colLen ; ++j) {
        		if(board[i][j] != '.' && !rowCheck.add(board[i][j])) {
        			return false;
        		}
        		if(board[j][i] != '.' && !colCheck.add(board[j][i])) {
        			return false;
        		}
        	}
        }
        // check sub-boxes of the grid
        HashSet<Character> subBoxCheck;
        for(int m = 0 ; m < rowLen ; m += 3) {
        	for(int n = 0 ; n < colLen ; n += 3) {
	        	// 1 sub-box
        		subBoxCheck = new HashSet<Character>();
        		for(int i = 0 ; i < 3 ; ++i) {
	        		for(int j = 0 ; j < 3 ; ++j) {
	        			if(board[i+m][j+n] != '.' && !subBoxCheck.add(board[i+m][j+n])) {
	            			return false;
	            		}
	        		}
	        	}
        	}
        }
        return true;
    }
	
	public static void main(String[] args) {
		int rowLen = 9;
        int colLen = 9;
		char[][] board = new char[rowLen][colLen];
		 for(int i = 0 ; i < rowLen ; ++i) {
        	for(int j = 0 ; j < colLen ; ++j) {
        		board[i][j] = (char)('0' + j);
        	}
    	}
	}
}

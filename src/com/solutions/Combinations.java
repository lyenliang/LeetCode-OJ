package com.solutions;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lyenliang
 *
 */
public class Combinations {
	public List<List<Integer>> combine(int n, int k) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		List<Integer> subResult = new ArrayList<Integer>();
		combination(1, n, k, result, subResult);
		return result;
	}

	private void combination(int start, int n, int k, List<List<Integer>> result, List<Integer> subResult) {
		if(k == 0) {
			result.add(subResult);
			return;
		}
		for(int i = start; i <= n; ++i) {
			List<Integer> subResultTemp = new ArrayList<Integer>(subResult);
			subResultTemp.add(i);
			//System.out.println("i" + i +", start: " + start + ", n: " + n + ", k: " + k + ", subResultTemp: " + subResultTemp);
			combination(i+1, n, k-1, result, subResultTemp);
		}
	}
	
	public static void main(String[] args) {
		Combinations c = new Combinations();
		List<List<Integer>> result = c.combine(4, 2);
		for(List<Integer> subResult : result) {
			for(Integer i : subResult) {
				System.out.print(i + " ");
			}
			System.out.println("");
		}
	}
}

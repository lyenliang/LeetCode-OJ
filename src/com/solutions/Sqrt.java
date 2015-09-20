package com.solutions;

/**
 * @author lyenliang
 *
 */
public class Sqrt {
	public int mySqrt(int x) {
		long high = x;
		long low = 0;
		long cur = (high + low) / 2;
		// avoid using while to prevent infinite loop
		while(low < high) {
			if ((cur * cur) > x) {
				high = cur;
				cur = (high + low) / 2;
			} else if ((cur * cur) < x) {
				low = cur + 1;
				cur = (high + low) / 2;
			} else {
				return (int)cur;
			}
		}
		return (int)(cur * cur == x ? cur : cur-1);
	}

	public static void main(String[] args) {
		Sqrt s = new Sqrt();
		System.out.println(s.mySqrt(0));
	}
}

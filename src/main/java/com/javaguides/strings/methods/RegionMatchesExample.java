package com.javaguides.strings.methods;

public class RegionMatchesExample {
	public static void main(String[] args) {
		String str = "javaguides";
		String subStr = "guides";
		boolean b = str.regionMatches(0, subStr, str.length(), str.length());
		boolean b1 = str.regionMatches(true, 0, str, 0, str.length());
		System.out.println(b);
		System.out.println(b1);
	}
}

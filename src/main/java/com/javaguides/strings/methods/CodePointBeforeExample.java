package com.javaguides.strings.methods;

public class CodePointBeforeExample {
	public static void main(String[] args) {
		String str = "javaguides";
		int unicode = str.codePointBefore(1);
		System.out.println("the character (Unicode code point)"
				+ "  at the before specified index is :: " + unicode);
	}
}

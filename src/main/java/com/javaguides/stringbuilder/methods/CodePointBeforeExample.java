package com.javaguides.stringbuilder.methods;

public class CodePointBeforeExample {
	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder("javaguides");
		int unicode = builder.codePointBefore(1);
		System.out.println("the character (Unicode code point) at the before specified index is :: " + unicode);
	}
}

package com.javaguides.stringbuilder.methods;

public class CodePointCountExample {
	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder("javaguides");
		System.out.println("length of the string :: " + builder.length());
		int unicode = builder.codePointCount(0, builder.length());
		System.out.println("the character (Unicode code point) at the specified index is :: " + unicode);
	}
}

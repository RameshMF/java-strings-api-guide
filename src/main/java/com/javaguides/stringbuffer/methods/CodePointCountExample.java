package com.javaguides.stringbuffer.methods;

public class CodePointCountExample {
	public static void main(String[] args) {
		StringBuffer buffer = new StringBuffer("javaguides");
		System.out.println("length of the string :: " + buffer.length());
		int unicode = buffer.codePointCount(0, buffer.length());
		System.out.println("the character (Unicode code point) at the specified index is :: " + unicode);
	}
}

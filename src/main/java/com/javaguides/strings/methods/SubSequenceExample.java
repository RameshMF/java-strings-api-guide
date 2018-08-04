package com.javaguides.strings.methods;

public class SubSequenceExample {
	public static void main(String[] args) {
		String str = "javaguides";
		CharSequence subStr = str.subSequence(0, str.length());
		System.out.println("Returns a character sequence that "
				+ " is a subsequence of this sequence : " + subStr);
	}
}

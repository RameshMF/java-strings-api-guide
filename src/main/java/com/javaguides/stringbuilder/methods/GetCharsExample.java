package com.javaguides.stringbuilder.methods;

public class GetCharsExample {
	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder("javaguides");
		char[] dst = new char[builder.length()];
		builder.getChars(0, builder.length(), dst, 0);
		
		for (char c : dst) {
			System.out.println(c);
		}
	}
}

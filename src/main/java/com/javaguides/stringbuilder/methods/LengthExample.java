package com.javaguides.stringbuilder.methods;

public class LengthExample {
	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder("javaguides");
		int length = builder.length();
		System.out.println(" length of the string '" + builder + "' is :: " + length);
	}
}

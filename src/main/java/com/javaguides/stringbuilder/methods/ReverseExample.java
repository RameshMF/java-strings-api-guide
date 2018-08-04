package com.javaguides.stringbuilder.methods;

public class ReverseExample {
	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder("javaguides");
		StringBuilder reverse = builder.reverse();
		System.out.println("Reversed string :" + reverse);
	}
}

package com.javaguides.stringbuilder.methods;

public class SetLengthExample {
	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder("javaguides");
		System.out.println("Before set length to 0 : " + builder.length());
		builder.setLength(0);
		System.out.println("After set length to 0 : " + builder.length());
		
	}
}

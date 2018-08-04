package com.javaguides.stringbuilder.methods;

public class StringBuilderConstructorExamples {
	public static void main(String[] args) {

		// Constructor 1
		// Constructs a string builder with no characters in it and an initial
		// capacity of 16 characters
		StringBuilder builder = new StringBuilder();
		System.out.println(builder.capacity());
		// Constructor 2
		// Constructs a string builder initialized to the contents of the
		// specified string. The initial capacity of the string builder is 16
		// plus the length of the string argument.

		StringBuilder builder2 = new StringBuilder("javaguides");
		System.out.println(builder2.capacity());
		// Constructor 3
		// Constructs a string builder initialized to the contents of the
		// specified string. The initial capacity of the string builder is 16
		// plus the length of the string argument.
		CharSequence charSequence = new String("charSequence");
		StringBuilder builder3 = new StringBuilder(charSequence);
		System.out.println(builder3.capacity());
		// Constructor 4
		// Constructs a string builder with no characters in it and an initial
		// capacity specified by the capacity argument.
		StringBuilder builder4 = new StringBuilder(10);
		System.out.println(builder4.capacity());

	}
}

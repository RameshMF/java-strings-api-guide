package com.javaguides.stringbuffer.methods;

public class StringBufferConstructorExamples {
	public static void main(String[] args) {

		// Constructor 1
		// Constructs a string buffer with no characters in it and an initial
		// capacity of 16 characters.
		StringBuffer buffer = new StringBuffer();
	//	System.out.println(buffer.capacity());
		// Constructor 2
		// Constructs a string buffer initialized to the contents of the
		// specified string. The initial capacity of the string buffer is 16
		// plus the length of the string argument.

		StringBuffer buffer2 = new StringBuffer("javaguides");
	//	System.out.println(buffer2.capacity());

		// Constructor 3
		// Constructs a string buffer that contains the same characters as the
		// specified CharSequence. The initial capacity of the string buffer is
		// 16 plus the length of the CharSequence argument.
		CharSequence charSequence = new StringBuilder("charSequence");
		StringBuffer buffer3 = new StringBuffer(charSequence);
		System.out.println(buffer3);
		// Constructor 4
		// Constructs a string builder with no characters in it and an initial
		// capacity specified by the capacity argument.
		StringBuffer buffer4 = new StringBuffer(20);
		//System.out.println(buffer4.capacity());
	}
}

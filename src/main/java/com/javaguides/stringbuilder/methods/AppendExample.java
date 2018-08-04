package com.javaguides.stringbuilder.methods;

public class AppendExample {
	public static void main(String[] args) {
		// 13 append overloaded methods

		StringBuilder builder;
		// append String

		// Append String
		builder = new StringBuilder().append("guides");
		System.out.println("Append string : " + builder);
		
		// Append char
		builder = new StringBuilder().append('c');
		System.out.println("Append char : " + builder);
		// Append Object
		builder = new StringBuilder().append(new Object().getClass());
		System.out.println("Append Object : " + builder);
		
		// Append chars
		char[] chars = { 'j', 'a', 'v', 'a' };
		builder = new StringBuilder().append(chars);
		System.out.println("Append chars : " + builder);
		
		// Append charSequence
		builder = new StringBuilder().append("charSequence");
		System.out.println("Append charSequence : " + builder);
		
		// Append Double
		builder = new StringBuilder().append(10.0d);
		System.out.println("Append Double : " + builder);
		
		// Append Float
		builder = new StringBuilder().append(10.5f);
		System.out.println("Append Float : " + builder);
		
		// Append int
		builder = new StringBuilder().append(100);
		System.out.println("Append int : " + builder);
		
		// Append Boolean
		builder = new StringBuilder().append(true);
		System.out.println("Append Boolean : " + builder);
		
		// Append Long
		builder = new StringBuilder().append(100000);
		System.out.println("Append Long : " + builder);
		
		// Appends the specified StringBuffer to this sequence
		builder = new StringBuilder().append(new StringBuffer("stringbuffer"));
		System.out.println("Append StringBuffer : " + builder);
		
		// Appends the string representation of a subarray of the char array.
		builder = new StringBuilder().append(chars, 1, 3);
		System.out.println("Append subarray of the char array : " + builder);
		
		// Appends a subsequence of the specified CharSequence to this sequence.
		builder = new StringBuilder().append("javaguides", 0, 9);
		System.out.println("Append CharSequence : " + builder);
		
		// Appends the string representation of the codePoint argument to this
		// sequence.
		builder = new StringBuilder("javaguides").appendCodePoint(0);
		System.out.println("Append appendCodePoint : " + builder);

	}
}

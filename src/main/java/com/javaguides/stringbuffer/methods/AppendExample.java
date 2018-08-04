package com.javaguides.stringbuffer.methods;

public class AppendExample {
	public static void main(String[] args) {
		// 14 append overloaded methods

		// Append String
		StringBuffer buffer;
		buffer = new StringBuffer().append("guides");
		System.out.println("Append String : " + buffer);

		// Append char
		buffer = new StringBuffer().append('c');
		System.out.println("Append char : " + buffer);

		// Append Object
		buffer = new StringBuffer().append(new Object().getClass());
		System.out.println("Append Object : " + buffer);

		// Append chars
		char[] chars = { 'j', 'a', 'v', 'a' };
		buffer = new StringBuffer().append(chars);
		System.out.println("Append chars : " + buffer);

		// Append charSequence
		CharSequence charSequence = new String("charSequence");
		buffer = new StringBuffer().append(charSequence);
		System.out.println("Append charSequence : " + buffer);

		// Append Double
		buffer = new StringBuffer().append(10.0d);
		System.out.println("Append Double : " + buffer);

		// Append Float
		buffer = new StringBuffer().append(10.5f);
		System.out.println("Append Float : " + buffer);

		// Append int
		buffer = new StringBuffer().append(100);
		System.out.println("Append int : " + buffer);

		// Append Boolean
		buffer = new StringBuffer().append(true);
		System.out.println("Append Boolean : " + buffer);

		// Append Long
		buffer = new StringBuffer().append(1000);
		System.out.println("Append Long : " + buffer);

		// Append stringbuffer
		buffer = new StringBuffer().append(new StringBuffer("stringbuffer"));
		System.out.println("Append stringbuffer : " + buffer);

		// Appends the string representation of a subarray of the char array
		// argument to this sequence.
		buffer = new StringBuffer().append(chars, 1, 3);
		System.out.println("Appends the string representation of a "
				+ " subarray of the char array argument to this sequence.  : " + buffer);

		// Appends a subsequence of the specified CharSequence to this sequence
		buffer = new StringBuffer().append("javaguides", 0, 9);
		System.out.println("Appends a subsequence of the specified " 
		+ " CharSequence to this sequence. : " + buffer);

		// Appends the string representation of the codePoint argument to this
		// sequence.
		buffer = new StringBuffer().appendCodePoint(5);
		System.out.println(
				"Appends the string representation of the "
		+ " codePoint argument to this sequence.  : " + buffer);
	}
}

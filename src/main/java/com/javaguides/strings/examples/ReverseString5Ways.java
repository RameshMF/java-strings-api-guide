package com.javaguides.strings.examples;

/**
 * 5 ways to reverse a String in Java
 * @author javaguides.net
 *
 */
public class ReverseString5Ways {

	public static void main(String[] args) {
		reverseWithStringConcat("javaguides");
		reverseWithStringBuilder("javaguides");
		reverseWithStringBuilderBuiltinMethod("javaguides");
		reverseWithSwaps("javaguides");
		reverseWithXOR("javaguides");
	}

	public static final String reverseWithStringConcat(String string) {
		String output = new String();
		for (int i = (string.length() - 1); i >= 0; i--) {
			output += (string.charAt(i));
		}
		
		display(string,output);
		return output;
	}

	public static final String reverseWithStringBuilder(String string) {
		final StringBuilder builder = new StringBuilder();
		for (int i = (string.length() - 1); i >= 0; i--) {
			builder.append(string.charAt(i));
		}
		display(string,builder.toString());
		return builder.toString();
	}

	public static final String reverseWithStringBuilderBuiltinMethod(String string) {
		final StringBuilder builder = new StringBuilder(string);
		display(string, builder.reverse().toString());
		return builder.reverse().toString();
	}

	public static final String reverseWithSwaps(String string) {
		final char[] array = string.toCharArray();
		final int length = array.length - 1;
		final int half = (int) Math.floor(array.length / 2);

		char c;
		for (int i = length; i >= half; i--) {
			c = array[length - i];
			array[length - i] = array[i];
			array[i] = c;
		}
		display(string, String.valueOf(array));
		return String.valueOf(array);
	}

	public static final String reverseWithXOR(String string) {
		final char[] array = string.toCharArray();
		final int length = array.length;
		final int half = (int) Math.floor(array.length / 2);

		for (int i = 0; i < half; i++) {
			array[i] ^= array[length - i - 1];
			array[length - i - 1] ^= array[i];
			array[i] ^= array[length - i - 1];
		}
		display(string, String.valueOf(array));
		return String.valueOf(array);
	}

	
	private static final void display(String original , String reverse){
		System.out.println(original);
		System.out.println(reverse);
		System.out.println("----------------------------");
	}
}

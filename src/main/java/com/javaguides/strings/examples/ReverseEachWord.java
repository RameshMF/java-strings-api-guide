package com.javaguides.strings.examples;

/**
 * Java Program To Reverse Each Word Of A String.
 * 
 * @author javaguides.net
 *
 */
public class ReverseEachWord {
	public static void main(String[] args) {
		
		reverseEachWord("java guides");
		
		reverseEachWord("I am string not reversed");
        
		reverseEachWord("Reverse Me");
        
	}

	private static String reverseEachWord(String originalStr) {

		// split the sentence by words using split method
		String[] words = originalStr.split(" ");

		StringBuilder reverseStr = new StringBuilder();

		// Iterate over String array
		for (String word : words) {
			// reverse each word by calling reverseWithStringConcat method
			StringBuilder temp = new StringBuilder(word);
			reverseStr.append(temp.reverse());
			reverseStr.append(" ");
		}
		
		display(originalStr, reverseStr.toString());
		return reverseStr.toString();
	}

	private static final void display(String original , String reverse){
		System.out.println(original);
		System.out.println(reverse);
		System.out.println("----------------------------");
	}
}

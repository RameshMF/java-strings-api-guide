package com.javaguides.strings.examples;

/**
 * Java Program to Swap Two Strings without Third String Variable
 * @author javaguides.net
 *
 */
public class SwapTwoStrings {
	public static void main(String[] args) {
		String s1 = "javaguides";

		String s2 = "javadesignpatterns";

		display("Before Swapping :",s1,s2);
		
		// Swapping starts

		s1 = s1 + s2;

		s2 = s1.substring(0, s1.length() - s2.length());

		s1 = s1.substring(s2.length());

		// Swapping ends

		display("After Swapping :",s1,s2);
	}
	
	private static final void display(String str, String s1 , String s2){
		System.out.println(str);
		System.out.println("s1 : " + s1);
		System.out.println("s2 : " + s2);
		System.out.println("--------------------------");
	}
}

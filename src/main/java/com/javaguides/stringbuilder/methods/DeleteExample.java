package com.javaguides.stringbuilder.methods;

public class DeleteExample {
	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder("javaguides");
		
		// start with index and end with end -1
		StringBuilder subBuilder = builder.delete(0, 4);
		System.out.println("Delete string 'java' from string 'javaguides' : " + subBuilder.toString());

		StringBuilder subBuilder1 = new StringBuilder("javaguides").deleteCharAt(4);
		System.out.println("Delete char 'g' from string 'javaguides' : " + subBuilder1);
	}
}

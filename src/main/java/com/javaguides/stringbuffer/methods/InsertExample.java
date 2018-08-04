package com.javaguides.stringbuffer.methods;

public class InsertExample {
	public static void main(String[] args) {
		
		// 12 insert overloaded method
		StringBuffer builder = new StringBuffer("javaguides").insert(1,true);
		System.out.println(builder.toString());
		
		builder = new StringBuffer("javaguides").insert(0, 'J');
		System.out.println(builder.toString());
		
		char[] chars = {'d','e','v','e','l','o','p','e','r'};
		builder = new StringBuffer("javaguides").insert(4, chars);
		System.out.println(builder.toString());
		
		CharSequence charSequence = new StringBuilder("J2EE/");
		builder = new StringBuffer("javaguides").insert(0, charSequence);
		System.out.println(builder.toString());
		
		builder = new StringBuffer("javaguides").insert(0, 100.0d);
		System.out.println(builder.toString());
		
		builder = new StringBuffer("javaguides").insert(0, 100.0f);
		System.out.println(builder.toString());
		
		builder = new StringBuffer("javaguides").insert(0, 100);
		System.out.println(builder.toString());
		
		builder = new StringBuffer("javaguides").insert(0, 100l);
		System.out.println(builder.toString());
		
		builder = new StringBuffer("javaguides").insert(0, new Object());
		System.out.println(builder.toString());
		
		builder = new StringBuffer("javaguides").insert(0, "ultimate");
		System.out.println(builder.toString());
		
		builder = new StringBuffer("javaguides").insert(0, chars, 0, chars.length);
		System.out.println(builder.toString());
		
		builder = new StringBuffer("javaguides").insert(0, charSequence, 0, charSequence.length());
		System.out.println(builder.toString());
		
	}
}

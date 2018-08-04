package com.javaguides.stringbuilder.methods;

public class EnsureCapacityExample {
	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder();
		builder.ensureCapacity(11);
	    System.out.println(builder.capacity());
	}
}

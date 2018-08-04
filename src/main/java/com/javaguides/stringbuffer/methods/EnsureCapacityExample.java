package com.javaguides.stringbuffer.methods;

public class EnsureCapacityExample {
	public static void main(String[] args) {
		StringBuffer builder = new StringBuffer();
		builder.ensureCapacity(11);
	    System.out.println(builder.capacity());
	    builder.ensureCapacity(17);
	    System.out.println(builder.capacity());
	}
}

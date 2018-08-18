package com.javaguides.strings.examples;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;


/**
 * Program to Checks if the CharSequence contains only Unicode letters or digits
 * @author javaguides.net
 *
 */
public class IsAlphanumericExample {

	public static boolean isEmpty(final CharSequence cs) {
		return cs == null || cs.length() == 0;
	}
	
	public static boolean isAlphanumeric(final CharSequence cs) {
		if (isEmpty(cs)) {
			return false;
		}
		final int sz = cs.length();
		for (int i = 0; i < sz; i++) {
			if (!Character.isLetterOrDigit(cs.charAt(i))) {
				return false;
			}
		}
		return true;
	}
	
	@Test
	public void testIsAlphanumeric() {
		assertFalse(isAlphanumeric(null));
		assertFalse(isAlphanumeric(""));
		assertFalse(isAlphanumeric(" "));
		assertTrue(isAlphanumeric("a"));
		assertTrue(isAlphanumeric("A"));
		assertTrue(isAlphanumeric("kgKgKgKgkgkGkjkjlJlOKLgHdGdHgl"));
		assertFalse(isAlphanumeric("ham kso"));
		assertTrue(isAlphanumeric("1"));
		assertTrue(isAlphanumeric("hkHKHik6iUGHKJgU7tUJgKJGI87GIkug"));
		assertFalse(isAlphanumeric("_"));
		assertFalse(isAlphanumeric("hkHKHik*khbkuh"));
	}
}

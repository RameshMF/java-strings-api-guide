package com.javaguides.strings.examples;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Checks if the CharSequence contains only Unicode letters
 * @author javaguides.net
 *
 */
public class IsAlphaExample {
	
	public static boolean isAlpha(final CharSequence cs) {
		if (isEmpty(cs)) {
			return false;
		}
		final int sz = cs.length();
		for (int i = 0; i < sz; i++) {
			if (!Character.isLetter(cs.charAt(i))) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean isEmpty(final CharSequence cs) {
		return cs == null || cs.length() == 0;
	}
	
	@Test
	public void testIsAlpha() {
		assertFalse(isAlpha(null));
		assertFalse(isAlpha(""));
		assertFalse(isAlpha(" "));
		assertTrue(isAlpha("a"));
		assertTrue(isAlpha("A"));
		assertTrue(isAlpha("kgKgKgKgkgkGkjkjlJlOKLgHdGdHgl"));
		assertFalse(isAlpha("ham kso"));
		assertFalse(isAlpha("1"));
		assertFalse(isAlpha("hkHKHik6iUGHKJgU7tUJgKJGI87GIkug"));
		assertFalse(isAlpha("_"));
		assertFalse(isAlpha("hkHKHik*khbkuh"));
	}
}

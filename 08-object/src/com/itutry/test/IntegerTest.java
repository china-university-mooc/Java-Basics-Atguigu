package com.itutry.test;

import org.junit.Test;

public class IntegerTest {

	@Test
	public void test() {
		Integer i = new Integer(1);
		Integer j = new Integer(1);
		System.out.println(i == j);
		
		Integer m = Integer.valueOf(1);
		Integer n = 1;
		System.out.println(m == n);
		
		Integer x = 128;
		Integer y = 128;
		System.out.println(x == y);
	}
}

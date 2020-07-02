package com.itutry.test;

import org.junit.Test;

public class ErrorTest {

	@Test
	public void test1() {
		test1();
	}
	
	@Test
	public void test2() {
		int[] arr = new int[1024 * 1024 * 1024];
		System.out.println(arr.length);
	}
}

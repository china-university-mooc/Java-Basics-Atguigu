package com.itutry.test;

import org.junit.Test;

public class WrapperTest {

	@Test
	public void test1() {
		Integer integer = new Integer(1);
		System.out.println(integer);
		
		int value = integer.intValue();
		System.out.println(value);
	}
	
	@Test
	public void test2() {
		Integer value = 5;
		String string = String.valueOf(value);
		String string2 = value.toString();
		String stirng3 = value + " ";
		System.out.println(string);
		System.out.println(string2);
		System.out.println(stirng3);
		
		Integer value2 = new Integer(string);
		int value3 = Integer.parseInt(string);
		System.out.println(value2);
		System.out.println(value3);	
	}
}

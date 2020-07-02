package com.itutry.test;

import java.util.Date;
import java.util.Scanner;

import org.junit.Test;

public class RuntimeExceptionTest {

	@Test
	public void test1() {
//		int[] arr = null;
//		System.out.println(arr[0]);
		
		String str = null;
		System.out.println(str.toLowerCase());
	}
	
	@Test
	public void test2() {
//		int[] arr = new int[3];
//		System.out.println(arr[3]);
		
		String str = "abc";
		System.out.println(str.charAt(3));
	}
	
	@Test
	public void test3() {
		Object obj = new Date();
		String str = (String) obj;
		System.out.println(str);
	}
	
	@Test
	public void test4() {
		String str = "abc";
		int num = Integer.parseInt(str);
		System.out.println(num);
	}
	
	@Test
	public void test5() {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		System.out.println(num);
		scanner.close();
	}
	
	@Test
	public void test6() {
		int a = 10;
		int b = 0;
		System.out.println(a / b);
	}
}

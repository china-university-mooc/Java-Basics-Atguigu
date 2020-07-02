package com.itutry.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Test;

public class FinallyTest {

	@Test
	public void test1() {
		int a = 10;
		int b = 0;
		try {
			System.out.println(a / b);
		} catch (ArithmeticException e) {
			e.printStackTrace();
			int[] arr = new int[10];
			System.out.println(arr[10]);
		} finally {
			System.out.println("finally");
		}
//		System.out.println("finally");
	}
	
	@Test
	public void test2() {
		System.out.println(method());
	}
	
	public int method() {
		try {
			int[] arr = new int[10];
//			System.out.println(arr[10]);
			return 1;
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			return 2;
		} finally {
			System.out.println("我一定要执行");
//			return 3;
		}
	}
	
	@Test
	public void test3() {
		FileInputStream fis = null;
		try {
//			File file = new File("hello.txt");
			File file = new File("hello1.txt");
			fis = new FileInputStream(file);
			
			int data = fis.read();
			while(data != -1) {
				System.out.print((char) data);
				data = fis.read();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fis != null) {
					fis.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}

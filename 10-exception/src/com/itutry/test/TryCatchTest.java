package com.itutry.test;

import org.junit.Test;

public class TryCatchTest {

	@Test
	public void test1() {
		try {
			String str = "123";
			str = "abc";
			int num = Integer.parseInt(str);
			System.out.println(num);
			System.out.println("hello 1");
		} catch (NumberFormatException e) {
//			System.out.println("出现数值转换异常了，不要着急...");
//			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (NullPointerException e) {
			System.out.println("空指针异常了，不要着急...");
		} catch (Exception e) {
			System.out.println("出现异常了，不要着急...");
		}
		
		System.out.println("hello 2");
	}
}

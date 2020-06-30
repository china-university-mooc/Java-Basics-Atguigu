package com.itutry.demo10;

public interface A {
	
	static void method1() {
		System.out.println("A method1");
	}
	
	default void method2() {
		System.out.println("A method2");
	}
}

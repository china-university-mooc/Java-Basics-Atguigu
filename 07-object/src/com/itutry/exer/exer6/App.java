package com.itutry.exer.exer6;

public class App {

	public static void main(String[] args) {
		int a = 10;
		int b = 10;
		method(a, b);
		
		System.out.println("a=" + a);
		System.out.println("b=" + b);
	}
	
	private static void method(int a, int b) {
		a *= 10;
		b *= 20;
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		
		System.exit(0);
	}
}

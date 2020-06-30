package com.itutry.demo12;

public class App {

	public static void main(String[] args) {
		A a = new A() {
			@Override
			public void method() {
				System.out.println("匿名 method");
				
			}
		};
		a.method();
	}
}

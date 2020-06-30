package com.itutry.demo13;

public class B {

	public A getA() {
		class SubA implements A {

			@Override
			public void method() {
				System.out.println("Sub method");
				
			}
			
		}
		return new SubA();
	}
}

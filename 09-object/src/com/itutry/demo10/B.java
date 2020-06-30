package com.itutry.demo10;

public class B extends C implements A {

	@Override
	public void method2() {
		super.method2();
		A.super.method2();
	}
}

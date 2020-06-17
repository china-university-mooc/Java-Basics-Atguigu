package com.itutry.demo.demo1;

public class Sub extends Base {

	@Override
	public void method1() {

	}

	@Override
	public double method2() {
		return super.method2();
	}

	@Override
	public Sub method3() {
		return new Sub();
	}

	@Override
	public void method4() throws RuntimeException {

	}
}

package com.itutry.demo16;

public class Outer {
	
	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.method();
	}

	public void method() {
		int num = 10;
//		num = 20;
		class A {
			public void show() {
//				num = 20;
				System.out.println(num);
			}
		}
		new A().show();
	}
}

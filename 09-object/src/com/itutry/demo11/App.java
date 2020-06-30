package com.itutry.demo11;

import com.itutry.demo11.Outer.A;
import com.itutry.demo11.Outer.B;

public class App {

	public static void main(String[] args) {
		Outer outer = new Outer();
		A a = outer.new A();
		a.show();
		B b = new Outer.B();
		b.show();
	}
}

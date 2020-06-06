package com.itutry.demo;

public class VarargsDemo {

	public static void main(String[] args) {
		VarargsDemo demo = new VarargsDemo();
		demo.method("a");
//		demo.method();
		demo.method(new String[] {"a", "b", "c"});
		demo.method("a", "b", "c");
	}
	
//	public void method(String a) {
//		System.out.println("(Sring)");
//	}jj
	
	public void method(String ...strings) {
		System.out.println("(String ...)");
	}
	
	public void method(int ...ints) {
		System.out.println("(int ...)");
	}
}

package com.itutry.demo11;

public class Outer {
	private static String id = "1";

	private String name = "Tom";
	
	public class A {
		private String name = "Jerry";
		
		public void show() {
			System.out.println(name);
			System.out.println(Outer.this.name);
		}
	}
	
	public static class B {
		private static String id = "2";
		
		public void show() {
			System.out.println(id);
			System.out.println(Outer.id);
		}
	}
}


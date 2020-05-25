package com.itutry.exer.exer2;

public class Person {

	String name;
	int age;
	/**
	 * 1表示男
	 * 0表示女
	 */
	int sex;
	
	public void study() {
		System.out.println("studying");
	}
	
	public void showAge() {
		System.out.println("我的年龄是：" + age);
	}
	
	public int addAge(int i) {
		age += i;
		return age;
	}
}

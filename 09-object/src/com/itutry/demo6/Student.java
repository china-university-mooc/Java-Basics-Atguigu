package com.itutry.demo6;

public class Student extends Person {

	public Student(String name, int age) {
		super(name, age);
	}

	@Override
	public void eat() {
		System.out.println("学生吃饭");
	}

	@Override
	public void sleep() {
		System.out.println("学生睡觉");
		
	}
	
}

package com.itutry.demo.demo4;

public class Person {

	private String name;
	private int age;
	
	public Person() {
		this(null, 0);
	}
	
	public Person(String name) {
		this(name, 0);
	}
	
	public Person(int age) {
		this(null, age);
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("200行初始化代码");
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	public void printInfo() {
		System.out.println("我叫" + name + ", 年龄是" + age);
	}
}

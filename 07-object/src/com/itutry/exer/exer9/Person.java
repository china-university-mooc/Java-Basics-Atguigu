package com.itutry.exer.exer9;

public class Person {

	private int age;
	private String name;
	
	public Person() {
		age = 18;
	}
	
	public Person(int i, String n) {
		age = i;
		name = n;
	}
	
	public void setAge(int i) {
		age = i;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setName(String n) {
		name = n;
	}
	
	public String getName() {
		return name;
	}
}

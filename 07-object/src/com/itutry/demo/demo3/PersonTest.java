package com.itutry.demo.demo3;

public class PersonTest {

	public static void main(String[] args) {
		Person p1 = new Person();
		System.out.println(p1.getAge());
		
		Person p2 = new Person(12);
		System.out.println(p2.getAge());
		
		p2.setAge(18);
		System.out.println(p2.getAge());
	}
}

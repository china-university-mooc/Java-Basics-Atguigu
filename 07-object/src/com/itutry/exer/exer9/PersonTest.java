package com.itutry.exer.exer9;

public class PersonTest {

	public static void main(String[] args) {
		Person person = new Person();
//		person.setAge(18);
		System.out.println(person.getAge());
		
		Person tom = new Person(30, "Tom");
		System.out.println("名字是" + tom.getName() + "，年龄是" + tom.getAge());
	}
}

package com.itutry.exer.exer2;

public class App {

	public static void main(String[] args) {
		Person person = new Person();
		person.name = "Tom";
		person.age = 18;
		person.sex = 1;
		
		person.study();
		person.showAge();
		int age = person.addAge(2);
		System.out.println(age);
		
		Person person2 = new Person();
		person2.name = "Jerry";
		person2.showAge();
		person2.addAge(10);
		person2.showAge();
		person.showAge();
		
	}
}

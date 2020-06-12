package com.itutry.demo.demo4;

public class PersonTest {

	public static void main(String[] args) {
		Person person = new Person("Tome", 18);
		person.printInfo();
		
		person.setName("Jerry");
		person.printInfo();
		
		Person person2 = new Person();
		person2.printInfo();
	}
}

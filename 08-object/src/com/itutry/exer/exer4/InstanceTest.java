package com.itutry.exer.exer4;

public class InstanceTest {
	
	public static void main(String[] args) {
		InstanceTest test = new InstanceTest();
		Person person = new Person();
		test.method(person);
		Student student = new Student();
		test.method(student);
		Graduate graduate = new Graduate();
		test.method(graduate);
	}

	public void method(Person e) {
		String info = e.getInfo();
		System.out.println(info);

		if (e instanceof Person) {
			System.out.println("a person");
		}
		if (e instanceof Student) {
			System.out.println("a student");
		}
		if (e instanceof Graduate) {
			System.out.println("a graduated student");
		}
	}
}

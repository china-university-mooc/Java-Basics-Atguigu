package com.itutry.exer.exer1;

public class App {

	public static void main(String[] args) {
		Student student = new Student();
		student.name = "Jerry";
		student.age = 18;
		student.major = "计算机科学";
		student.interests = "踢球";
		System.out.println(student.say());
		
		Teacher teacher = new Teacher();
		teacher.name = "Tom";
		teacher.age = 35;
		teacher.teachAge = 11;
		teacher.course = "计算机";
		System.out.println(teacher.say());
	}
}

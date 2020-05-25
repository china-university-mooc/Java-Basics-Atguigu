package com.itutry.exer.exer5;

public class App {

	public static void main(String[] args) {
		Student[] students = new Student[20];
		for (int i = 0; i < students.length; i++) {
			students[i] = new Student();
			students[i].number = i + 1;
			students[i].state = (int)(Math.random() * 6 + 1);
			students[i].score = (int)(Math.random() * 101);
		}
		
		App app = new App();
		app.print(students);
		
		System.out.println("=======================================");
		app.printStateBy(students, 3);
		
		System.out.println("========================================");
		app.sort(students);
		app.print(students);
	}
	
	public void printStateBy(Student[] students, int state) {
		for (int i = 0; i < students.length; i ++) {
			if (students[i].state == state) {
				System.out.println(students[i].say());
			}
		}
	}
	
	public void sort(Student[] students) {
		for (int i = 0; i < students.length - 1; i++) {
			for (int j = 0; j < students.length - 1 - i; j++) {
				if (students[j].score > students[j + 1].score) {
					Student temp = students[j];
					students[j] = students[j + 1];
					students[j + 1] = temp;
				}
			}
		}
	}
	
	public void print(Student[] students) {
		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i].say());
		}
	}
}

package com.itutry.exer3;

public abstract class Employee {

	private String name;
	private int number;
	private MyDate birthday;
	
	
	
	public String getName() {
		return name;
	}



	public int getNumber() {
		return number;
	}



	public MyDate getBirthday() {
		return birthday;
	}



	public Employee(String name, int number, MyDate birthday) {
		super();
		this.name = name;
		this.number = number;
		this.birthday = birthday;
	}



	public abstract double earnings();
}

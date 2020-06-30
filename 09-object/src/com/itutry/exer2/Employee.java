package com.itutry.exer2;

public abstract class Employee {

	private String name;
	private String id;
	private double salary;
	
	public Employee(String name, String id, double salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	
	public abstract void work();
}

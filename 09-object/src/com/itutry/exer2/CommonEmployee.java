package com.itutry.exer2;

public class CommonEmployee extends Employee {

	public CommonEmployee(String name, String id, double salary) {
		super(name, id, salary);
	}

	@Override
	public void work() {
		System.out.println("普通员工干活");
	}

}

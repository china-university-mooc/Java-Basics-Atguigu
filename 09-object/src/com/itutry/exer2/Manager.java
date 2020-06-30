package com.itutry.exer2;

public class Manager extends Employee {
	
	private double bonus;

	public Manager(String name, String id, double salary, double bonus) {
		super(name, id, salary);
		this.bonus = bonus;
	}

	@Override
	public void work() {
		System.out.println("经理管理员工");
	}

}

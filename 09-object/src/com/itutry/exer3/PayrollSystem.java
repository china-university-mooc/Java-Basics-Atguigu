package com.itutry.exer3;

public class PayrollSystem {

	public static void main(String[] args) {
		Employee[] employees = new Employee[] {
				new SalariedEmployee("Tom", 1, new MyDate(1994, 11, 2), 1000),
				new HourlyEmployee("Jerry", 2, new MyDate(1990, 10, 28), 100, 40)
		};
		
		for (int i = 0; i < employees.length; i++) {
			System.out.println(employees[i]);
		}
	}
}

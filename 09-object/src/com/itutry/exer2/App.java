package com.itutry.exer2;

public class App {

	public static void main(String[] args) {
		Employee employee = new CommonEmployee("Tom", "1", 1000);
		Employee manager = new Manager("Tom", "1", 1000, 10000);
		employee.work();
		manager.work();
	}
}

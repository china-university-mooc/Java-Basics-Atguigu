package com.itutry.exer.exer6;

public class App {

	public static void main(String[] args) {
		Order order1 = new Order(1001, "AA");
		Order order2 = new Order(1001, "BB");
		boolean b1 = order1.equals(order2);
		System.out.println(b1);
		
		Order order3 = new Order(1001, "AA");
		boolean b2 = order1.equals(order3);
		System.out.println(b2);
	}
}

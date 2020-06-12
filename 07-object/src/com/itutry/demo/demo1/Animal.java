package com.itutry.demo.demo1;

public class Animal {

	private int legs;
	
	public void setLets(int l) {
		if (l < 0 || l % 2 != 0) {
			System.out.println("Wrong number of legs");
			return;
		}
		legs = l;
	}
	
	public int getLegs() {
		return legs;
	}
	
	public void eat() {
		System.out.println("Eating");
	}
	
	public void move() {
		System.out.println("Moving");
	}
}

package com.itutry.demo.demo1;

public class Zoo {

	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.setLets(7);
		System.out.println(animal.getLegs());
		animal.eat();
		animal.move();
	}
}

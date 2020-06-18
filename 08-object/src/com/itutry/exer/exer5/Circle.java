package com.itutry.exer.exer5;

public class Circle extends GeometricObject {

	private double radius;
	
	public Circle(String color, double weight, double radius) {
		super(color, weight);
		this.radius = radius;
	}
	
	@Override
	protected double findArea() {
		return 3.14 * radius * radius;
	}
}

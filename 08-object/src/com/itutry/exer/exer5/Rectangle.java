package com.itutry.exer.exer5;

public class Rectangle extends GeometricObject {

	private double width;
	private double height;
	
	public Rectangle(String color, double weight, double width, double height) {
		super(color, weight);
		this.width = width;
		this.height = height;
	}

	@Override
	protected double findArea() {
		return width * height;
	}
}

package com.itutry.exer.exer2;

public class Circle {

	private double radius;

	public Circle() {
		super();
		radius = 1.0;
	}
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	
	public double getRadius() {
		return radius;
	}



	public void setRadius(double radius) {
		this.radius = radius;
	}



	public double findArea() {
		return Math.PI * radius * radius;
	}
}

package com.itutry.exer.exer5;

public class App {

	public static void main(String[] args) {
		App app = new App();
		Circle c1 = new Circle("red", 1, 1.5);
		Circle c2 = new Circle("red", 2, 1.5);
		app.displayGeometricObject(c1);
		app.displayGeometricObject(c2);
		boolean equalsArea = app.equalsArea(c1, c2);
		System.out.println(equalsArea);
	}
	
	public boolean equalsArea(GeometricObject g1, GeometricObject g2) {
		return g1.findArea() == g2.findArea();
	}
	
	public void displayGeometricObject(GeometricObject g) {
		System.out.println(g.findArea());
	}
}

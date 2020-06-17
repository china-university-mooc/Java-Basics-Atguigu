package com.itutry.exer.exer2;

public class App {

	public static void main(String[] args) {
		Cylinder cylinder = new Cylinder(1.5, 2.1);
		double area = cylinder.findArea();
		System.out.println("圆柱的表面积是：" + area);
		double volume = cylinder.findVolume();
		System.out.println("圆柱的体积是：" + volume);
		
		Circle circle = new Circle(1.5);
		System.out.println("圆的面积是：" + circle.findArea());
	}
}

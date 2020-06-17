package com.itutry.exer.exer1;

public class App {

	public static void main(String[] args) {
		Kids someKid = new Kids();
		someKid.setSex(0);
		someKid.setYearsOld(12);
		
		someKid.manOrWoman();
		someKid.employeed();
		someKid.printAge();
	}
}

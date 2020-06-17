package com.itutry.exer.exer1;

public class Kids extends ManKind {

	private int yearsOld;
	
	
	public int getYearsOld() {
		return yearsOld;
	}


	public void setYearsOld(int yearsOld) {
		this.yearsOld = yearsOld;
	}


	public void printAge() {
		System.out.println("I am " + yearsOld + " years old");
	}
	
	@Override
	public void employeed() {
		super.employeed();
		System.out.println("but Kids should study and no job");
	}
}

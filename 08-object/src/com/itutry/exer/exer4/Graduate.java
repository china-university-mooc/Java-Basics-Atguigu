package com.itutry.exer.exer4;

public class Graduate extends Student {

	public String major = "IT";
	
	@Override
	public String getInfo() {
		return "Name: " + name + "\nage: " + age + "\nschool: " + school + "\nmajor: " + major;
	}
}

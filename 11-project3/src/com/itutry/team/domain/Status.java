package com.itutry.team.domain;

public class Status {

	public static final Status FREE = new Status("FREE");
	public static final Status BUSY = new Status("BUSY");
	public static final Status VOCATION = new Status("VOCATION");
	
	private final String name;
	
	private Status(String name) {
		this.name = name;
	}
	
	
	
	public String getName() {
		return name;
	}



	@Override
	public String toString() {
		return name;
	}
}

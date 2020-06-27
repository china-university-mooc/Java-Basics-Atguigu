package com.itutry.singleton.hunger;

public class Singleton {

	private static Singleton instance = new Singleton();

	private Singleton() {

	}

	public static Singleton getInstatnce() {
		return instance;
	}
}

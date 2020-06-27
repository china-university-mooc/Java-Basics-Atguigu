package com.itutry.singleton.lazy;

import com.itutry.singleton.hunger.Singleton;

public class App {

	public static void main(String[] args) {
		System.out.println(Singleton.getInstatnce());
		System.out.println(Singleton.getInstatnce());
		System.out.println(Singleton.getInstatnce());
	}
}

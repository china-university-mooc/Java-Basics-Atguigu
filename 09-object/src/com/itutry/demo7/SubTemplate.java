package com.itutry.demo7;

public class SubTemplate extends Template {

	@Override
	public void code() {
		for (int i = 0; i < 1000; i++) {
			System.out.println(i);
		}
	}
}

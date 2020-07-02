package com.itutry.demo;

import java.io.FileNotFoundException;
import java.io.IOException;

public class OverrideDemo {

	public static void main(String[] args) {
		display(new SubClass());
	}
	
	public static void display(SuperClass s) {
		try {
			s.method();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}

class SuperClass {
	
	public void method() throws IOException {
		
	}
}

class SubClass extends SuperClass {

	@Override
	public void method() throws FileNotFoundException {
		
	}
}


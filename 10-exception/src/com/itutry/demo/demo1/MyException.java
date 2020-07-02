package com.itutry.demo.demo1;

public class MyException extends Exception {

	static final long serialVersionUID = -7034897190745777939L;
	
	public MyException() {
		
	}
	
	public MyException(String msg) {
		super(msg);
	}
}

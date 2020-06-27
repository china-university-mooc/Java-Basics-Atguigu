package com.itutry.demo3;

public class CodeBlock {

	public static int code = 10;
	
	static {
		System.out.println("static block1");
	}
	static {
		System.out.println("static block2");
	}
	
	{
		System.out.println("block1");
	}
	{
		System.out.println("block1");
	}
}

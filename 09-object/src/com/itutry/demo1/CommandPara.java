package com.itutry.demo1;

public class CommandPara {

	public static void main(String[] args) {
		for(int i = 0; i < args.length; i++) {
			System.out.println("args[" + i + "]=" + args[i]);
		}
	}
}

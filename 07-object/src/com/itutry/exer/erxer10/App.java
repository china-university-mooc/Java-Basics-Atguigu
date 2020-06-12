package com.itutry.exer.erxer10;

public class App {

	public static void main(String[] args) {
		Boy boy = new Boy("罗密欧", 22);
		Girl girl = new Girl("朱丽叶", 20);
		girl.marry(boy);
		boy.shout();
	}
}

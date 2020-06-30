package com.itutry.demo14;

public class App {

	public static void main(String[] args) {
		Computer computer = new Computer();
		computer.transferData(new Flash());
		computer.transferData(new Printer());
	}
}

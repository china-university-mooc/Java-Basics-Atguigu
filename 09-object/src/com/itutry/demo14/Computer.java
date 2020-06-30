package com.itutry.demo14;

public class Computer {

	public void transferData(USB usb) {
		usb.start();
		System.out.println("具体传输数据的细节");
		usb.stop();
	}
}

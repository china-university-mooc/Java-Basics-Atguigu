package com.itutry.demo14;

public class Flash implements USB {

	@Override
	public void start() {
		System.out.println("U盘开始工作");
		
	}

	@Override
	public void stop() {
		System.out.println("U盘结束工作");
		
	}

}

package com.itutry.demo15;

public class Service implements Network {

	@Override
	public void browse() {
		System.out.println("真实的服务器访问网络");
	}

}

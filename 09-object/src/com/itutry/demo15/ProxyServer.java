package com.itutry.demo15;

public class ProxyServer implements Network {

	private final Network work;
	
	public ProxyServer(Network work) {
		this.work = work;
	}

	@Override
	public void browse() {
		check();
		work.browse();
	}
	
	private void check() {
		System.out.println("联网之前的检查工作");
	}

}

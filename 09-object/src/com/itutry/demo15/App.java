package com.itutry.demo15;

public class App {

	public static void main(String[] args) {
		ProxyServer proxyServer = new ProxyServer(new Service());
		proxyServer.browse();
	}
}

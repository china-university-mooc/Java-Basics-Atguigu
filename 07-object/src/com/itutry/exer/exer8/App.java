package com.itutry.exer.exer8;

public class App {

	private static int count = 0;
	
	public static void main(String[] args) {
		System.out.println(recursion(3));
	}
	
	public static int recursion(int k) {
		count++;
		System.out.println("count:" + count + ", k:" + k);
		if (k <= 0) {
			return 0;
		}
		return recursion(k-1) + recursion(k-2);
	}
}

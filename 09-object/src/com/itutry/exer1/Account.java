package com.itutry.exer1;

public class Account {

	private int id;
	private String password;
	private double balance;
	private static double interestRate = 0.02;
	private static double minBalance = 10;
	private static int total = 0;
	
	public Account() {
		id = ++total;
	}
	
	public Account(String password, double balance) {
		this();
		this.password = password;
		this.balance = balance;
	}



	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public static double getInterestRate() {
		return interestRate;
	}

	public static void setInterestRate(double interestRate) {
		Account.interestRate = interestRate;
	}

	public static double getMinBalance() {
		return minBalance;
	}

	public static void setMinBalance(double minBalance) {
		Account.minBalance = minBalance;
	}

	public int getId() {
		return id;
	}

	public double getBalance() {
		return balance;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", password=" + password + ", balance=" + balance + "]";
	}
	
	
}

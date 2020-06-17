package com.itutry.exer.exer3;

public class CheckAccount extends Account {

	private double overdraft;

	public CheckAccount(int id, double balance, double annualInterestRate, double overdraft) {
		super(id, balance, annualInterestRate);
		this.overdraft = overdraft;
	}

	public double getOverdraft() {
		return overdraft;
	}

	public void setOverdraft(double overdraft) {
		this.overdraft = overdraft;
	}

	@Override
	public void withdraw(double amount) {
		double balance = getBalance();
		if (balance >= amount) {
			super.withdraw(amount);
		} else if (balance + overdraft >= amount) {
			super.withdraw(balance);
			overdraft -= (amount - balance);
		} else {
			System.out.println("超过透支额度");
		}
	}
}

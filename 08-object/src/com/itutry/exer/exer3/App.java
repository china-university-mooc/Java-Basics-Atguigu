package com.itutry.exer.exer3;

public class App {

	public static void main(String[] args) {
		Account account = new Account(1122, 20000, 0.045);
		
		account.withdraw(30000);
		System.out.println("余额为：" + account.getBalance());
		account.withdraw(2500);
		account.deposit(3000);
		System.out.println("余额为：" + account.getBalance());
		System.out.println("月利率为：" + account.getMonthlyInterest());
		
		System.out.println("-----------------------");
		CheckAccount checkAccount = new CheckAccount(1122, 20000, 0.045, 5000);
		checkAccount.withdraw(5000);
		System.out.println("账户余额为：" + checkAccount.getBalance());
		System.out.println("可透支额为：" + checkAccount.getOverdraft());
		checkAccount.withdraw(18000);
		System.out.println("账户余额为：" + checkAccount.getBalance());
		System.out.println("可透支额为：" + checkAccount.getOverdraft());
		checkAccount.withdraw(3000);
		System.out.println("账户余额为：" + checkAccount.getBalance());
		System.out.println("可透支额为：" + checkAccount.getOverdraft());
	}
}

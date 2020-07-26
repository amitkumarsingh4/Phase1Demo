package com.simplilearn.methods.bank;

public class Main {

	public static void main(String[] args) {
		
		Account account = new Account(1020, "John Smith", 200000, "john.smith@gmail.com");
		BanOperations opr = new BanOperations();
		
		opr.showAccountBalance(account);
		opr.depositAmout(account, 10000);
		opr.withdrawAmout(account, 50000);

	}

}

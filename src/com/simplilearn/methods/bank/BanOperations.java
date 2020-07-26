package com.simplilearn.methods.bank;

public class BanOperations {

	//show balance
	public void showAccountBalance(Account account) {
		System.out.println("The account user is"+account.getName());
		System.out.println("The balance is"+account.getBalance());
	}
	
	// deposit operation
	public void depositAmout(Account account, double depositAmt) {
		if(depositAmt>0) {
			System.out.println("Balance before: "+account.getBalance());
			double updatedBalane = account.getBalance() + depositAmt;
			account.setBalance(updatedBalane);
			System.out.println("Balance after: "+account.getBalance());
		}
	}
	
	//withdraw operation
	public void withdrawAmout(Account account, double withdrawAmt) {
		if(withdrawAmt>0) {
			System.out.println("Balance before withdraw: "+account.getBalance());
			double updatedBalane = account.getBalance() - withdrawAmt;
			account.setBalance(updatedBalane);
			System.out.println("Balance after withdraw: "+account.getBalance());
		}
	}
	
}

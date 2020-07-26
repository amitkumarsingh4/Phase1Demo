package com.simplilearn.methods.bank;
// java bean (pojo)
public class Account {
	
	private int accNo;
	private String name;
	private double balance;
	private String email;
	
	//default constructor
	//constructor dont have return value
	public Account() {
		
	}
	
	//parametarized constructor
	public Account(int accNo) {
		this.accNo = accNo;
	}


	public Account(int accNo, String name, double balance, String email) {
		this.accNo = accNo;
		this.name = name;
		this.balance = balance;
		this.email = email;
	}


	//encapsulation
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}

package com.simplilearn.methods.abstractions;

public class Main {

	public static void main(String[] args) {
		AxisBank axisBank=new AxisBank();
		SbiBank sbiBank=new SbiBank();
		
		int balance = 1000;
		
		float results1 = balance * axisBank.fixedRateOfInterest();
		float results2 = balance * sbiBank.fixedRateOfInterest();
		
		System.out.println("The Balance in Axis Bank:"+results1);
		System.out.println("The Balance in sbi Bank:"+results2);

	}

}

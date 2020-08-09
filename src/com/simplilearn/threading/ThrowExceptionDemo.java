package com.simplilearn.threading;

public class ThrowExceptionDemo {
	
	
	public static void division(int a , int b) {
		
		if(b!=0) {
			System.out.println("The result:"+a/b);
		}
		else {
			throw new ArithmeticException("The dividend cannot be zero");
		}
		
		
	} 

	public static void main(String[] args) {

		int number1=100;
		int number2=0;
		
		
		division(number1, number2);
		
	}

}

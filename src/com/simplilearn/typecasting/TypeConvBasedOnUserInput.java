package com.simplilearn.typecasting;

import java.util.Scanner;

public class TypeConvBasedOnUserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number 1-100:");
		
		//int userNumber = input.nextInt();
		String userNumber = input.nextLine();
		
		int userIntValue = Integer.parseInt(userNumber);
		long userLongValue = Long.parseLong(userNumber);
		double userDoubleValue = Double.parseDouble(userNumber);
		
		System.out.println("User input as Integer:"+userNumber);
		System.out.println("User input as Integer:"+userIntValue);
		System.out.println("User input as Long:"+userLongValue);
		System.out.println("User input as Double:"+userDoubleValue);
		

	}

}

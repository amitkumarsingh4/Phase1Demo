package com.simplilearn.arraysDemo;

import java.util.Scanner;

public class TestArray {

	public static void main(String[] args) {

		int [] numberList1; //preferred
		int numberList2[];
		
		String nameArray[]= {"John", "Mike", "David"};
		for (int i=0; i<nameArray.length; i++) {
			System.out.println("String values:" + nameArray[i]);
		}
		
		String topTenCompanies []= {"Dell", "TCS", "INFOSYS", "HCL", "POLARIS", "MICROSOFT", "AMAZON", "APPLE", "SAMSUNG", "LOGITECH"};
	
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your company name:");
		
		String inpComp = input.nextLine();
		for (int i=0; i<topTenCompanies.length; i++) {
			if (topTenCompanies[i].equals(inpComp))
			System.out.println("your company is number: "+i+1);
		}
		
		
	}

}

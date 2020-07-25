package com.simplilearn.typecasting;

public class StringConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String price = "100";
		int priceInt= Integer.parseInt(price);
		
		System.out.println("price value: "+price);
		System.out.println("priceInt value: "+priceInt);
		
		int num=10;
		String data = String.valueOf(num);

		System.out.println("data value: "+data);
		
	}

}

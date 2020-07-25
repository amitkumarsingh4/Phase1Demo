package com.simplilearn.typecasting;

public class ExplicitTypeCasting {
	
	
	public static void main(String[] args) {
		
		//Explicit type cast on narrowing
		//double -> float -> long ->int ->short ->byte
		
		double price =127.49;
		long priceLong = (long) price;
		
		int priceInt =(int) priceLong;
		
		byte priceByte = (byte) priceLong;
		
		System.out.println("double value: "+price);
		System.out.println("Long value: "+priceLong);
		System.out.println("int value: "+priceInt);
		System.out.println("byte value: "+priceByte);
		
		
		}

}

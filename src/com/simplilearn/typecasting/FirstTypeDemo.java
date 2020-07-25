package com.simplilearn.typecasting;

public class FirstTypeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//starting point of your program
		
		//singleline comment
		/**
		 * multiline 
		 * comment
		 */
		
		//widening or automatic or implicit typecasting
		// Byte->short->int->long->float->double
		byte countByte = 127;
		int count = 100;
		long countBig = count;
		
		float countFP = countBig;
		double countDecimal= countFP;
		double byteToDouble = countByte;
		
		int doubleToInt = (int) byteToDouble;
		
		System.out.println("Int value: "+count);
		System.out.println("Long value: "+countBig);
		System.out.println("Float value value: "+countFP);
		System.out.println("Double value: "+countDecimal);
		System.out.println("ByteDouble value: "+byteToDouble);

	}

}

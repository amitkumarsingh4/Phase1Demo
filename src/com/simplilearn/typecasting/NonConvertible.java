package com.simplilearn.typecasting;

public class NonConvertible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char firstCharacter='c';
		int number =100;
		
		firstCharacter= (char) number;
		
		System.out.println("firstCharacter: "+firstCharacter);
		

	}

}

package com.simplilearn.stringdemo;

public class TestStringImmutable {

	public static void main(String[] args) {

		String name = "John";
		
		name.concat(" Smith");
		
		System.out.println("Name is:"+name);//concat not working
		
		String concatName= name.concat(" Smith");
		System.out.println("Name is:"+concatName);
		
	}

}

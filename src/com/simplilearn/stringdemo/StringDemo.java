package com.simplilearn.stringdemo;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name ="NOAH";
		String firstName = "NOAH";
		
		String stringName= new String("NOAH");
		
		System.out.println("The Name:"+name);
		System.out.println("The same Name literal:"+firstName);
		
		System.out.println("The new name:"+stringName);
		
		if(name == firstName) {
			System.out.println("string literal");
		}

		
		if(name == stringName) {
			System.out.println("string literal");
		} else {
			System.out.println("new string");
		}
		
		System.out.println("charAt:"+ stringName.charAt(2));
		
		//name[2]='b';
	}

}

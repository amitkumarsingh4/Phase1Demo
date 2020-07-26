package com.simplilearn.accessmodifier;

class Person
{
	//member variable
	private int age =40;
	public int agep=40;
	public long salary=100000;
	protected String dob="19aug1981";
	String doj="24feb2004";
	//member method
	private void showAge() {
		System.out.println("Age is:"+age);
	}
	
	
	public int showAgeP() {
		return agep;
	}
}

public class AccessModifierDemo {

	//starting point of your code execution
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person person = new Person();
		
		System.out.println("The age is:"+ person.agep);
		

	}

}

package com.simplilearn.accessmodifier;

public class AccessModifierCall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person person = new Person();
		person.showAgeP();
		
		System.out.println("The age is:"+ person.agep);
		System.out.println("The salary is:"+ person.salary);
		System.out.println("The dob is:"+ person.dob);
		System.out.println("The doj is:"+ person.doj);

	}

}

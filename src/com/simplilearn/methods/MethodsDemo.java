package com.simplilearn.methods;

public class MethodsDemo {
	
	public static void showMessage() {
	 System.out.println("My first method");
		
	}
	
	public static String getMessage() {
		 return "My second method";
			
		}
	
	public static void  greetUser(String name) {
		 System.out.println("Hi welcome,"+name);
			
		}
	
	public static void  greetUser(String name, int age, String acc) {
		 System.out.println("Hi ,"+name);
		 System.out.println("your age,"+age);
		 System.out.println("occupation is, "+acc);
		}
	
	public static int getLuckyNumber() {
		 return 1;
			
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		showMessage();
		String res =getMessage();
		System.out.println(res);
		int number = getLuckyNumber();
		System.out.println(number);
		
		greetUser("John Smith");
		greetUser("123455");
		greetUser("amit", 39, "Trainer");
		

	}

}

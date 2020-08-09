package com.simplilearn.threading;

public class ExceptionDemo {
	
	
	public static void division(int a , int b) {
		try {
		int x= a/b;}
		catch (NullPointerException e) {
			System.out.println("The NullPointerException exception");
		}
		catch (ArithmeticException e) {
			System.out.println("The ArithmeticException exception");
		}
		catch (NumberFormatException e) {
			System.out.println("The NumberFormatException exception");
		}
		catch (Exception e) {
			System.out.println("The general exception");
		} finally {
			System.out.println("The finally block");
		}
		
		
	} 

	public static void main(String[] args) {

		int number1=100;
		int number2=0;
		division(number1, number2);
		
	}

}

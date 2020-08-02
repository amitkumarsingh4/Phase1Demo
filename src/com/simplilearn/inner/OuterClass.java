package com.simplilearn.inner;

public class OuterClass {

	public String data = "Secure data";
	private double price = 40.5;
	
	class InnerClass{
		
		public void showData() {
			System.out.println("Data:" +data);
			
		}
		
        public void showPrice() {
        	System.out.println("Price: " + price);
		}
		
	}

}

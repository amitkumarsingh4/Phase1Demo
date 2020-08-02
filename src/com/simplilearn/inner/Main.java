package com.simplilearn.inner;

public class Main {

	public static void main(String[] args) {

		OuterClass outerClass = new OuterClass();
		
		OuterClass.InnerClass inner = outerClass.new InnerClass();
		
		inner.showData();
		inner.showPrice();
		
		
	}

}

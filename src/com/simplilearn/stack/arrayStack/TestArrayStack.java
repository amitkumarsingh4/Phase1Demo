package com.simplilearn.stack.arrayStack;

public class TestArrayStack {

	public static void main(String[] args) {

		Employee johnSmith = new Employee(100, "John Smith", "Dev", 29888.98);
		Employee marrySmith = new Employee(101, "mary Smith", "Dev", 19888.98);
		Employee willClark = new Employee(102, "will clark", "Dev", 39888.98);
		Employee davidDoe = new Employee(103, "David Doe", "Dev", 49888.98);
		
		stackArrayDemo stack = new stackArrayDemo(10);
		
		System.out.println("Stack size:"+ stack.size());
		System.out.println("Stack capacity:"+ stack.capacity());
		
		stack.push(johnSmith);
		stack.push(marrySmith);
		stack.push(willClark);
		stack.printStack();
		System.out.println("Stack size:"+ stack.size());
		System.out.println("Stack capacity:"+ stack.capacity());
	}

}

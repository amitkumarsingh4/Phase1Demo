package com.simplilearn.stack.linkedstack;

import java.util.LinkedList;

public class LinkedStack {
	
	private LinkedList<Employee> stack;
	
	LinkedStack(){
		
		stack = new LinkedList<Employee>();
	}
	
	//push 
	public void push(Employee employee) {
		stack.push(employee);
	}
	
	public Employee pop() {
		return stack.pop();
	}
	
	public Employee peek() {
		return stack.peek();
	}
	
	public int size() {
		return stack.size();
	}
	
	public boolean isEmpty() {
		return stack.isEmpty();
	}
	
	public void printStack() {
		
		for(Employee emp: stack) {
			System.out.println(emp);
		}
	}

}

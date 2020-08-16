package com.simplilearn.stack.arrayStack;

import java.util.EmptyStackException;

//import com.simplilearn.stack.linkedstack.Employee;

public class stackArrayDemo {

   private int top;
   private Employee[] stack;
   
   stackArrayDemo(int capacity){
	   stack = new Employee[capacity];
   }
	
	//push --> add element in stack
   public  void push(Employee employee) {
	   //stack is full check
	   if(top == stack.length) {
		   Employee[] newStack = new Employee[2*stack.length];
		   System.arraycopy(stack, 0, newStack, 0, stack.length);
		   stack = newStack;
	   }
	   
	   //add values in stack array
	   stack[top] = employee;
	   top = top+1;
	   //stack[top++] = employee;
	   
   }
   
   
   // pop --> remove element from stack
   public  Employee pop() {
	   //stack is empty
	   if(isEmpty()) {
		   throw new EmptyStackException();
	   }
	   
	   //remove element from stack
	   Employee employee=stack[--top];
	   stack[top] = null;
	   return employee;
	   
   }
   
   public int size() {
	   return top;
   }
   
   public int capacity() {
	   return stack.length;
   }
   
   public boolean isEmpty() {
	   return top == 0;
   }
   
   public void printStack() {
	   for(Employee emp: stack) {
			System.out.println(emp);
		}
	   
   }
   
   
   
}

package com.simplilearn.CollectionsDemo;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class TestAllQueue {

	public static void main(String[] args) {
		
		// Child of collections
		//first in first out
		// use queue as an ordered list
		//two imp class: priorityqueue and arraydequeue
		
		//first in first out
		Queue<String> queueOfBankUsers1 = new ArrayDeque<>();
		queueOfBankUsers1.add("John Smith");
		queueOfBankUsers1.add("Mike Smith");
		queueOfBankUsers1.add("Amit Varma");
		queueOfBankUsers1.add("Jai Krishna");
		
		System.out.println("all elements:"+queueOfBankUsers1);
		System.out.println("head element:"+queueOfBankUsers1.element());
		System.out.println("head element:"+queueOfBankUsers1.peek());
		
		// sorted queue
		Queue<String> queueOfBankUsers2 = new PriorityQueue<>();
		queueOfBankUsers2.add("John Smith");
		queueOfBankUsers2.add("Mike Smith");
		queueOfBankUsers2.add("Amit Varma");
		queueOfBankUsers2.add("Jai Krishna");
		
		System.out.println("head element:"+queueOfBankUsers2);
		System.out.println("head element:"+queueOfBankUsers2.element());
		System.out.println("head element:"+queueOfBankUsers2.peek());

	}

}

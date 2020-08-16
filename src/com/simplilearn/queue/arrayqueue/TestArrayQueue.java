package com.simplilearn.queue.arrayqueue;


public class TestArrayQueue {

	public static void main(String[] args) {
       
		Employee johnSmith = new Employee(100, "John Smith", "Dev", 29888.98);
		Employee marrySmith = new Employee(101, "mary Smith", "Dev", 19888.98);
		Employee willClark = new Employee(102, "will clark", "Dev", 39888.98);
		Employee davidDoe = new Employee(103, "David Doe", "Dev", 49888.98);
		
		ArrayQueue queue = new ArrayQueue(4);
		System.out.println("Queue size:"+ queue.size());
		
		queue.add(johnSmith);
		queue.add(marrySmith);
		queue.add(willClark);
		queue.add(davidDoe);
		
		queue.printQueue();
		
	}

}

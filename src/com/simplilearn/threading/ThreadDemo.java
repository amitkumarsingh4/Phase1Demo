package com.simplilearn.threading;

public class ThreadDemo extends Thread {
	
	public void run() {
		System.out.println("Main thread is runing....");
	}

	public static void main(String[] args) {

	ThreadDemo t1 = new ThreadDemo();
	t1.start();
	
	//new
	//sleep
	//wait
	//dead
	//new
	//runnable
	//running
	
	
	
	
	}

}

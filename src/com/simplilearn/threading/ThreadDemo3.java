package com.simplilearn.threading;



class Ramu extends Thread{
	
	public void run() {
		
		for (int i=0; i<=5;i++) {
			System.out.println("Working thread1...Hi");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}


   class Shamu extends Thread{
	
	public void run() {
		
		for (int i=0; i<=5;i++) {
			System.out.println("Working thread2...Hello");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}



public class ThreadDemo3 {
	
	public static void main(String[] args) {
	
		Ramu t1 = new Ramu();
		
		Shamu t2 = new Shamu();
		
		t1.start();
		t2.start();
		
	}

}

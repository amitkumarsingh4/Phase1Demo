package com.simplilearn.threading;



class WorkingThread1 extends Thread{
	
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


   class WorkingThread2 extends Thread{
	
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



public class ThreadDemo2 {
	
	public static void main(String[] args) {
	
		WorkingThread1 t1 = new WorkingThread1();
		
		WorkingThread2 t2 = new WorkingThread2();
		
		t1.start();
		t2.start();
		
	}

}

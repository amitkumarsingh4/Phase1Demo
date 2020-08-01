package com.simplilearn.stringdemo;

public class PerformanceTestSBufferandSbuilder {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		StringBuffer name = new StringBuffer("John");
		
		for (int i=0; i<200000; i++) {
			name.append(" Smith");
		}
		long timeTaken = System.currentTimeMillis()-startTime;
		
		System.out.println("Time for appending:"+ timeTaken);
		
		
		
		long startTime1 = System.currentTimeMillis();
		StringBuilder name1 = new StringBuilder("John");
		
		for (int i=0; i<200000; i++) {
			name1.append(" Smith");
		}
		long timeTaken1 = System.currentTimeMillis() - startTime1;
		
		System.out.println("Time for appending:"+ timeTaken1);
		
	}

}

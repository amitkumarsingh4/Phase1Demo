package com.simplilearn.DataStructureDemo;

public class ArrayDataStructureDemo {

	public static void main(String[] args) {
		
		int numbers[] = new int[5];
		
		numbers[0]=1;
		numbers[1]=2;
		numbers[2]=3;
		numbers[3]=4;
		numbers[4]=5;

		//O(1) -> linear time complexity
		for(int i=0;i<numbers.length;i++) {
		 System.out.println(i+ "=>"+ numbers[i]);
		}

	}

}

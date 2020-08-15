package com.simplilearn.DataStructureDemo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDataStructureDemo {

	public static void main(String[] args) {

		List<Integer> numberList = new ArrayList<Integer>();
		numberList.add(10);
		numberList.add(3);
		numberList.add(30);
		numberList.add(40);
		numberList.add(50);
		
		for(Integer value: numberList) {
			System.out.println(value);
		}
		
		
		List<Integer> linkedList = new LinkedList<Integer>();
		linkedList.add(100);
		linkedList.add(300);
		linkedList.add(300);
		linkedList.add(400);
		linkedList.add(500);
		
		for(Integer value: linkedList) {
			System.out.println(value);
		}
		
		
		
	}

}

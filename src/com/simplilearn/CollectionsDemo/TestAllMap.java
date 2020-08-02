package com.simplilearn.CollectionsDemo;

import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

public class TestAllMap {

	public static void main(String[] args) {
	
		
	
	
	//WAP for a map
		// id add name
		// id -> key -> integer
		//name -> value -> string
		//find a employee with id
		
		//thread safe
		Map<String, Double> listOfItems= new Hashtable<String, Double>();
		listOfItems.put("apple", 44.7);
		listOfItems.put("orange", 54.7);
		listOfItems.put("kiwi", 24.7);
		listOfItems.put("grapes", 74.7);
		
		System.out.println("List of fruits and pricess: "+ listOfItems);
	
	
		Map<Integer, String> listOfStuedent= new TreeMap<Integer, String>();
		listOfStuedent.put(5, "Mike");
		listOfStuedent.put(1, "John");
		listOfStuedent.put(2, "William");
		listOfStuedent.put(3, "Mary");
		listOfStuedent.put(4, "Vijay");
		
		System.out.println("Map of student rollnumber: "+ listOfStuedent);
		
		
		for (Map.Entry student : listOfStuedent.entrySet()) {
			System.out.println(student.getKey() +":-> "+student.getValue());
		}
		
		
		//WAP for bill value and bill type using any of the map
		
		
	}

}

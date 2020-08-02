package com.simplilearn.CollectionsDemo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class TestAllList {

	public static void main(String[] args) {
     
	ArrayList<String> nameList = new ArrayList<>();
	nameList.add("John");
	nameList.add("Joe");
	
	//Internally store values as dynamic array // shifting if we add //better for read
	List <String> listOfCompanies = new ArrayList<>();
	listOfCompanies.add("Dell");
	listOfCompanies.add("Wipro");
	listOfCompanies.add("BOA");
	listOfCompanies.add("BOS");
	listOfCompanies.set(3, "Simplilearn");
	System.out.println("Array List collection:-"+ listOfCompanies);
	
	//Internally store values as dynamic array // shifting if we add //better for read //old so rare usage
	List <String> listOfCity = new Vector<>();
	listOfCity.add("Hyd");
	listOfCity.add("Pune");
	listOfCity.add("Mumbai");
	listOfCity.add("Bangalore");
	System.out.println("Vector collection:-"+ listOfCity);
	
	//Internally store values as doubly linked list // no shifting if we add //better for insert and delete
    List <String> listOfFruits = new LinkedList<>();
	listOfFruits.add("Apple");
	listOfFruits.add("Orange");
	listOfFruits.add("Pear");
	listOfFruits.add("Mango");
	listOfFruits.set(3, "Banana");
	System.out.println("Linkedlist collection:-"+ listOfFruits);	
		
	}

}

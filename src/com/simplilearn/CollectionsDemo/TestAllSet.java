package com.simplilearn.CollectionsDemo;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestAllSet {

	public static void main(String[] args) {
         //set is child interface in collection
		//set do not store duplicate values
		//Implementation class: hashset, linkedhaset, treeset
		
		//not ordered and unique elements
		//uses hashcode of the object to store values
		//hashset is backed by hashtable
		Set<String> listOfUniqueCompanies = new HashSet<>();
		listOfUniqueCompanies.add("Dell");
		listOfUniqueCompanies.add("Wipro");
		listOfUniqueCompanies.add("Dell");
		boolean res=listOfUniqueCompanies.add("Dell");
		System.out.println(res);
		listOfUniqueCompanies.add("ABC");
		System.out.println("Hashset collection:-"+ listOfUniqueCompanies);
		
		//order is preserved
		//unique elements
		Set<String> listOfCity = new LinkedHashSet<>();
		listOfCity.add("Hyd");
		listOfCity.add("Pune");
		listOfCity.add("Mumbai");
		listOfCity.add("Bangalore");
		System.out.println("linkedhasset collection:-"+ listOfCity);
		
		//Unique, ascending order, faster than above two
		Set<String> listOfFruits = new TreeSet<>();
		listOfFruits.add("Apple");
		listOfFruits.add("Orange");
		listOfFruits.add("Pear");
		listOfFruits.add("Mango");
		System.out.println("Linkedlist collection:-"+ listOfFruits);	
		
	}

}

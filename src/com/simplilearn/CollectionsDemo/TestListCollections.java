package com.simplilearn.CollectionsDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestListCollections {

	public static void main(String[] args) {

		//List: order collection and duplicate allowed
		
		//List <data-type> list = new ArrayList<>();
		
		List<String> empList = new ArrayList<String>();
		
		//add values in list
		empList.add("John Smith");
		empList.add("Mike Smith");
		empList.add("Willaiam Carl");
		empList.add("Marry David");
		
		System.out.println("Employee List:"+empList) ;
		
		Iterator<String> itr = empList.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next()) ;
		}
		
		for(String empName: empList){
			System.out.println("Employee Name:"+ empName) ;
			
		}
		
		for (int i=0; i<empList.size(); i++) {
			System.out.println("String values:" + empList.get(i));
		}
		
	}

}

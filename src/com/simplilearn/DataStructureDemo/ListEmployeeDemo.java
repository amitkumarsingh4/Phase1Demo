package com.simplilearn.DataStructureDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListEmployeeDemo {

	public static void main(String[] args) {

		Employee johnSmith = new Employee(100, "John Smith", "Dev", 29888.98);
		Employee marrySmith = new Employee(101, "mary Smith", "Dev", 19888.98);
		Employee willClark = new Employee(102, "will clark", "Dev", 39888.98);
		Employee davidDoe = new Employee(103, "David Doe", "Dev", 49888.98);
		
		
		List<Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(johnSmith);
		employeeList.add(marrySmith);
		employeeList.add(willClark);
		employeeList.add(davidDoe);
		
		for(int i=0;i<employeeList.size();i++) {
			 System.out.println(i+ "=>"+ employeeList.get(i).getName());
			}
		
		LinkedList<Employee> employeeLList = new LinkedList<Employee>();
		employeeLList.addFirst(johnSmith);
		employeeLList.addFirst(marrySmith);
		employeeLList.addFirst(willClark);
		employeeLList.addLast(davidDoe);
		
		Iterator iter = employeeLList.iterator();
		System.out.println("HEAD ->");
		while(iter.hasNext()) {
			System.out.println(employeeLList.getFirst());
			System.out.println("<=>");
		}
		
		
	}

}

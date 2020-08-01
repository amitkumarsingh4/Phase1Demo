package com.simplilearn.CollectionsDemo;

public class Employee {

	String name;
    double sal;
    String designation;
    String id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Employee(String name, double sal, String designation, String id) {
		super();
		this.name = name;
		this.sal = sal;
		this.designation = designation;
		this.id = id;
	}
    
    public Employee() {
    	
    }
    
    //WAP for student list - id, fname, lname, marks, address
    //WAP for creating a song - id, sname, writer, singer
	
	
}

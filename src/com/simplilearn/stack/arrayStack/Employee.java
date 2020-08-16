package com.simplilearn.stack.arrayStack;

public class Employee {
	
	private int d;
	private String name;
	private String dept;
	private double salary;
	public int getD() {
		return d;
	}
	public void setD(int d) {
		this.d = d;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Employee(int d, String name, String dept, double salary) {
		this.d = d;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}
	
	

}

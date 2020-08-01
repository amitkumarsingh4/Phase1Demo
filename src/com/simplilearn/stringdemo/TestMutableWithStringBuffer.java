package com.simplilearn.stringdemo;

public class TestMutableWithStringBuffer {

	public static void main(String[] args) {

        StringBuffer name = new StringBuffer("John");//thread safe, slower
		
		name.append(" Smith");
		
		System.out.println("Name is:"+name);//append works//not thread safe, faster
		
        StringBuilder name1 = new StringBuilder("John");
		
		name1.append(" Smith");
		
		System.out.println("Name is:"+name1);//append works
		
		
	}

}

package com.simplilearn.Filedemo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileCreateDemo {

	public static void main(String[] args) throws IOException {
	

		File fobj = new File("/home/ubuntu/eclipse-workspace/Phase1-Demo/Demo2.txt");
		try {
			boolean status = fobj.createNewFile();
			
			if(status) {
				System.out.println("File created: "+ fobj.getName());
				System.out.println("File path: "+ fobj.getAbsolutePath());
				System.out.println("File readable: "+ fobj.canRead());
				System.out.println("File length: "+ fobj.length());
				
				FileWriter fwrite= new FileWriter(fobj);
				fwrite.write("Today is good day");
				fwrite.write("Tomorrow is a parley G");
				fwrite.close();
				
			} else {
				System.out.println("File already exists: "+ fobj.getName());
			}
			
		} catch (IOException e) {
            System.out.println("An error occured");
			e.printStackTrace();
		}
		
	
		
	}

}


//Create a file as employee.txt -> ask user to enter a name and append that name to file

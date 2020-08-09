package com.simplilearn.Filedemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandlingDemo {

	public static void writeOpr (File file) throws IOException {
		FileOutputStream fout = null;
		String data = " Welcome to file handling class";
		try {
			fout = new FileOutputStream(file);
			fout.write(data.getBytes());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			fout.close();
		}}
	
	public static void readOpr (File file) throws IOException {
		FileInputStream fin = null;
		try {
			fin = new FileInputStream(file);
			int i=0;
			while((i=fin.read()) <=-1) {
				System.out.println((char)i);
				}
			System.out.println("Read operation completed");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			fin.close();
		}}
	
	
	public static void main(String[] args) throws IOException {

		File fobj = new File("/home/ubuntu/eclipse-workspace/Phase1-Demo/FDemo.txt");
		
		//writeOpr(fobj);
		readOpr(fobj);
		
	}

}

package com.rays.io;

import java.io.File;

public class Question1 {
	public static void main(String[] args) {
		
		try {

		      File folder = new File("C:\\Users\\Asus\\eclipse-workspace\\core java\\src\\com\\rays\\oop");

		      File[] files = folder.listFiles();
		      for(File file : files) {
		        if(file.isFile()) {
		          System.out.println(file);
		        }
		      }
		    } catch (Exception e) {
		      e.getStackTrace();
		    }
	}

}

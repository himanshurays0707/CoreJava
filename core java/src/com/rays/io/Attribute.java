package com.rays.io;

import java.io.File;
import java.util.Date;

public class Attribute {
	public static void main(String[] args) {
		File f= new File("C:\\Users\\Asus");
		if(f.exists()) {
			System.out.println("Name " +f.getName());
			System.out.println("Is writable " +f.getAbsolutePath());
			System.out.println("Is readable " +f.canRead());
			System.out.println("Is writable " +f.canWrite());
			System.out.println("Is File " +f.isFile());
			System.out.println("Is Directory " +f.isDirectory());
			System.out.println("Last modified " +f.lastModified());
			System.out.println("Length is " +f.length());
			System.out.println("Delete " +f.delete());
			System.out.println("Rename is " +f.renameTo(f));
			System.out.println("Dir is " +f.mkdir());
			System.out.println("String " +f.toString());
			System.out.println("List is " +f.list());
			System.out.println("File is " +f.listFiles());
			System.out.println("Name is " +f.getName());
			System.out.println("Exists  " +f.exists());
			System.out.println("Can read " +f.canRead());
			System.out.println("Can write " +f.canWrite());
			System.out.println("Length " +f.length());
			
		}
		
	}

}

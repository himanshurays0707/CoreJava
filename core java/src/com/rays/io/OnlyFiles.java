package com.rays.io;

import java.io.*;

public class OnlyFiles {
	public static void main(String[] args) {
		File directory = new File("C:\\Users\\Asus");
		//File directory = new File(args[0]);
		String[] list = directory.list();
		for(int i=0;i<list.length;i++) {
			File f= new File("c:\\Users\\Asus",list[i]);
			if(f.isFile()) {
				System.out.println((i+1) + ":" + list[i]);
			}
		}
	}

}

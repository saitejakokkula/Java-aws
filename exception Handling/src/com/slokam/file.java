package com.slokam;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class file {

	public static void main(String[] args) {
		try {
		String path = "C:\\Users\\kokku\\OneDrive\\Documents\\slokam\\hi.txt";
		FileReader f = new FileReader(path);
		BufferedReader r = new BufferedReader(f);
		System.out.println(r.readLine());
		System.out.println(r.readLine());
		System.out.println(r.readLine());
		System.out.println(r.readLine());
		System.out.println(r.readLine());
		System.out.println(f);
		}catch(FileNotFoundException e) {
			System.out.println(e);
		}catch(IOException e) {
			System.out.println(e);
		}
		
	}

}

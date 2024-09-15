package com.slokam;

import java.io.FileReader;

public class sai {

	public static void main(String[] args) {
		
		try {
			String path = "C:\\Users\\kokku\\OneDrive\\Documents\\slokam\\h1.txt";
			FileReader f = new FileReader(path);
			System.out.println(f);
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}

package com.slokam;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class raju {
	public static void main(String[] args) {
		
		String path = "C:\\Users\\kokku\\OneDrive\\Documents\\slokam\\hi.txt";
		
		try {
			FileReader f = new FileReader(path);
			BufferedReader b = new BufferedReader(f);
			
			for(String s = b.readLine(); s!=null; s = b.readLine()) {
				
				String[] data = s.split(",");
				
				for(int i =0 ;i <= data.length-1; i++) {
					
					System.out.println(data[i]);
					
				}
				System.out.println("---------------------------------");
			}
		}catch(FileNotFoundException e) {
			System.out.println(e);
		}catch(IOException e) {
			System.out.println(e);
		}
	}

}

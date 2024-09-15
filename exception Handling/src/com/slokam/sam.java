  package com.slokam;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class sam {

	public static void main(String[] args) {
		

		String path = "C:\\Users\\kokku\\OneDrive\\Documents\\slokam\\hi.txt";
		
		try {
			FileReader f = new FileReader(path);
			BufferedReader b = new BufferedReader(f);
			
			for(String s = b.readLine(); s!=null; s = b.readLine()) {
				
				String[] data = s.split(",");
				if(data.length > 2 && data[2].trim().equalsIgnoreCase("b.tech")) {
					
					for(int j = 0; j< data.length; j++) {
						System.out.println(data[j]);
		           	}
					System.out.println("-------------------------------------");
			       }
				}
		}catch(FileNotFoundException e) {
			System.out.println(e);
		}catch(IOException e) {
			System.out.println(e);
		}catch(Exception e) {
			System.out.println(e);
		}

  }
}

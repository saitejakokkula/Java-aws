package com.slokam;

import java.io.BufferedReader;
import java.io.FileReader;

public class searchbysqual {
	
public void searchqual(String squal) {
		
		String path = "C:\\Users\\kokku\\OneDrive\\Documents\\slokam\\hi.txt";
		FileReader f = null;
		BufferedReader b = null;
		try {
			f = new FileReader(path);
			b = new BufferedReader(f);
			for(String s = b.readLine();s!=null;s = b.readLine()) {
				
				String[] data = s.split(",");
				if(squal.equals(data[3])) {
				student t = new student();
				t.setSid(Integer.valueOf(data[0]));
				t.setSname(data[1]);
				t.setSage(Integer.valueOf(data[2]));
				t.setSqul(data[3]);
				
				System.out.println(t.getSid());
				System.out.println(t.getSname());
				System.out.println(t.getSage());
				System.out.println(t.getSqul());
				System.out.println("-----------------------------------------");
			}
		 }
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}

package com.sk;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class studentcontor {
	
	public void writer(student slokam) {
		
		String path = "C:\\Users\\kokku\\OneDrive\\Documents\\slokam\\slokam.txt";
		FileWriter f = null;
		BufferedWriter b = null;
		
		try {
			f = new FileWriter(path, true);
			b = new BufferedWriter(f);
			String h = slokam.getSid()+","+slokam.getSname()+","+slokam.getSage()+","+slokam.getSmarks()+","+slokam.getSqul();
			b.newLine();
			b.write(h);
			b.flush();
			
			
		}catch(Exception e) {
			System.out.println(e);
			
		}
		
	
	}
	

}

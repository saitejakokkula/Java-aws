package com.slokam;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;


public class studentcontor {

	public void save(student std) {
		
			
			String path = "C:\\Users\\kokku\\OneDrive\\Documents\\slokam\\slokam.txt";
			FileWriter f = null;
			BufferedWriter b = null;
			
			try {
				f = new FileWriter(path, true);
				b = new BufferedWriter(f);
				String h = std.getSid()+","+std.getSname()+","+std.getSage()+","+std.getSmarks()+","+std.getSqual();
				b.newLine();
				b.write(h);
				b.flush();
				
				
			}catch(Exception e) {
				System.out.println(e);
				
			}
		}
	
	 public void getbyid(int sid) {
		 String path = "C:\\Users\\kokku\\OneDrive\\Documents\\slokam\\h1.txt";
		 FileReader f = null;
		 BufferedReader b = null;
		
		try {
			f = new FileReader(path);
			b = new BufferedReader(f);
			for(String s  = b.readLine(); s!=null; s = b.readLine() ) {
				
				String[] data = s.split(",");
				if(sid == Integer.valueOf(data[0])) {
				student t = new student();
				t.setSid(Integer.valueOf(data[0]));
				t.setSname(data[1]);
				t.setSage(Integer.valueOf(data[2]));
				t.setSmarks(Double.valueOf(data[3]));
				t.setSqual(data[4]);
				
				System.out.println(t.getSid());
				System.out.println(t.getSname());
				System.out.println(t.getSage());
				System.out.println(t.getSmarks());
				System.out.println(t.getSqual());
				System.out.println("-------------------------------------");
				}
			}
			
		}catch(Exception e) {
			System.out.println(e);
			
		}
	}
	
	public void getbyname(String sname) {
		String path = "C:\\Users\\kokku\\OneDrive\\Documents\\slokam\\slokam.txt";
		FileReader f = null;
		BufferedReader b = null;
		try {
			f = new FileReader(path);
			b = new BufferedReader(f);
			for(String s = b.readLine();s!=null;s = b.readLine()) {
				
				String[] data = s.split(",");
				if(data.length == 5 && sname.equals(data[1])) {
				student t = new student();
				t.setSid(Integer.valueOf(data[0]));
				t.setSname(data[1]);
				t.setSage(Integer.valueOf(data[2]));
				t.setSmarks(Double.valueOf(data[3]));
				t.setSqual(data[4]);
				
				System.out.println(t.getSid());
				System.out.println(t.getSname());
				System.out.println(t.getSage());
				System.out.println(t.getSmarks());
				System.out.println(t.getSqual());
				System.out.println("-----------------------------------------");
			}
		 }
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public void getall() {
		String path = "C:\\Users\\kokku\\OneDrive\\Documents\\slokam\\slokam.txt";
		FileReader f = null;
		BufferedReader b = null;
		
		try {
			f = new FileReader(path);
			b = new BufferedReader(f);
			for(String s = b.readLine();s!=null;s = b.readLine()) {
				
				String[] data = s.split(",");
				student t = new student();
				if(data.length == 5) {
				t.setSid(Integer.valueOf(data[0]));
				t.setSname(data[1]);
				t.setSage(Integer.valueOf(data[2]));
				t.setSmarks(Double.valueOf(data[3]));
				t.setSqual(data[4]);
				
			    System.out.println(t.getSid());
			    System.out.println(t.getSname());
			    System.out.println(t.getSage());
			    System.out.println(t.getSname());
			    System.out.println(t.getSqual());
			    System.out.println("-----------------------------------");
			   }
			}	
		
	   }catch(Exception e) {
		    System.out.println(e);
	   }
    }
}


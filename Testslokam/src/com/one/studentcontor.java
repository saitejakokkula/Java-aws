package com.one;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class studentcontor {
	
	public void getdata(student std) {
		
		String path = "C:\\Users\\kokku\\OneDrive\\Documents\\slokam\\sai.txt";
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
		}finally {
			try {
				b.close();
				f.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	public boolean getbysid(int sid) {
		
		boolean flag = true;
		String path = "C:\\Users\\kokku\\OneDrive\\Documents\\slokam\\sai.txt";
		FileReader f = null;
		BufferedReader b = null;
		
		try {
			f = new FileReader(path);
			b = new BufferedReader(f);
			for(String s = b.readLine(); s!=null; s= b.readLine()) {
				
				String[] data = s.split(",");
				
				if(sid == Integer.parseInt(data[0])) {
					
					flag = false;
				}
			}
			
		}catch(Exception e) {
			System.out.println(e);
		}
		return flag;
	}
	public void getbysname(String sname) {
		
		String path = "C:\\Users\\kokku\\OneDrive\\Documents\\slokam\\sai.txt";
		FileReader f = null;
		BufferedReader b = null;
		
		try {
			f = new FileReader(path);
			b = new BufferedReader(f);
			for(String s = b.readLine(); s!=null; s= b.readLine()) {
				
				String[] data = s.split(",");
				if(sname.equals(data[1])) {
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
				System.out.println("---------------------------------------------");
				}
			}
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}

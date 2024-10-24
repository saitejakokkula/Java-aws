package com.one;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class serialization {
	
	public static void main(String[] args) {
		
		Test t = new Test();
		t.setEid(1);
		t.setEname("rakesh");
		t.setEloc("hyderabad");
		t.setEdesg("de");
		
		try {
			System.out.println("serialization is started----");
			 String filepath = "C:\\Users\\kokku\\OneDrive\\Documents\\sai.txt";
			 FileOutputStream os = new FileOutputStream(filepath);
			 ObjectOutputStream o = new ObjectOutputStream(os);
			 o.writeObject(t);
			 System.out.println("serialization is completed----");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		
	}
	

}

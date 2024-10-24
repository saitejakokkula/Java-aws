package com.one;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class deserialization {

	public static void main(String[] args) {
		
		
		try {
			String filepath = "C:\\Users\\kokku\\OneDrive\\Documents\\sai.txt";
			FileInputStream i = new FileInputStream(filepath);
			ObjectInputStream o = new ObjectInputStream(i);
			Test t = (Test)o.readObject();
			System.out.println(t);
			System.out.println("deserialization is completed---");
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}

	}

}

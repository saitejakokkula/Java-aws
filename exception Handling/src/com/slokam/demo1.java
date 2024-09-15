package com.slokam;

import java.io.File;

public class demo1 {

	public static void main(String[] args) {
		
		String path = "C:\\Users\\kokku\\";
		
		File f = new File(path);
		
		
		File[] data = f.listFiles();
		
		
		for(int i=0;i<=data.length-1;i++) {
			
			if(data[i].isDirectory()) {
				System.out.println(data[i]+"--"+data[i].isDirectory());
				
			}
		}
		File[] fname = f.listFiles();
		for(int j =0 ;j<=fname.length-1;j++) {
			System.out.println(fname[j]);
		}
	}

}

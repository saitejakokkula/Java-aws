package com.slokam;

import java.io.File;
import java.io.IOException;

public class TestFile {

	public static void main(String[] args) throws IOException {
		
		String path = "C:\\Users\\kokku\\OneDrive\\Documents\\slokam\\h1.txt";
		File f = new File(path);
		System.out.println(f.createNewFile());

	}

}

package com.cicso;

public class sam {

	public static void main(String[] args) {
		
		
		StringBuffer sb = new StringBuffer("Hello welcome");
		//sb.append("world");
		sb.insert(2, "sai");
		sb.delete(2, 5);
		//sb.reverse();
		sb.setLength(5);
		System.out.println(sb);
		System.out.println(sb.capacity());
		System.out.println(sb.substring(0, 5));
		sb.setCharAt(1, 'e');
		sb.replace(5, 14, "Java");
		System.out.println(sb);
		

	}

}

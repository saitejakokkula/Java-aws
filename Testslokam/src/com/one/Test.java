package com.one;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		studentcontor s = new studentcontor();
		student t = new student();
		boolean sai=true;
		while(sai) {
			System.out.println("Enter a sid:");
			int sid = sc.nextInt();
			System.out.println("please wait I will check we have same id is present or not");
			boolean flag = s.getbysid(sid);
			if(flag) {
			System.out.println("Enter a sname:");
			String sname = sc.next();
			System.out.println("Enter a sage:");
			int sage = sc.nextInt();
			System.out.println("Enter a smarks:");
			double smarks = sc.nextDouble();
			System.out.println("Enter a squal");
		    String squal = sc.next();
			t.setSid(sid);
			t.setSname(sname);
		    t.setSage(sage);
			t.setSmarks(smarks);
			t.setSqual(squal);
			//System.out.println("Enter a sname:");
			//s.getbysname(sc.next());
			
			s.getdata(t);
			}
			else {
				System.out.println("ID already present you can enter");
			}
			System.out.println("student data select true & false");
			sai=sc.nextBoolean();
			}
		
	

	}

}

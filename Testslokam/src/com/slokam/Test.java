package com.slokam;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("for save data please select----1");
		System.out.println("for save id please select---2");
		System.out.println("for save sname please select----3");
	    System.out.println("for get all data please---4");
		
	    student a = new student();
		studentcontor t = new studentcontor();
		
		 int ChoiceOperation = sc.nextInt();
		 
		 switch(ChoiceOperation) {
		 case 1:
			 System.out.println("Enter a sid:");
			 a.setSid(sc.nextInt());
			 System.out.println("Enter a sname:");
			 a.setSname(sc.next());
			 System.out.println("Enter a sage:");
			 a.setSage(sc.nextInt());
			 System.out.println("Enter a smarks:");
			 a.setSmarks(sc.nextDouble());
			 System.out.println("Enter a squal:");
			 a.setSqual(sc.next());
			 t.save(a);
			 System.out.println("Successfully saved..!");
			 break;
		 case 2:
			 System.out.println("Enter a sid:");
			 t.getbyid(sc.nextInt());
			 break;
		 case 3:
			 System.out.println("Enter a sname");
			 t.getbyname(sc.next());
			 break;
		 case 4:
			 System.out.println("Enter a all data");
			 t.getall();
			 System.out.println("Completed");
			 break;
			 default:
				 System.out.println("No data is Entered");
		 }
	}

}

package com.sk;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Values:");
		student t = new student();
		t.setSid(sc.nextInt());
		t.setSname(sc.next());
		t.setSage(sc.nextInt());
		t.setSmarks(sc.nextDouble());
		t.setSqul(sc.next());
		
		studentcontor a = new studentcontor();
		a.writer(t);
		System.out.println("completed..!");

	}

}

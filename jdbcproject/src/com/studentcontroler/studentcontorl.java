package com.studentcontroler;

import com.studentdeo.studentdeo;
import com.studentpojo.student;

public class studentcontorl {
	
	private studentdeo sdeo = new studentdeo();
	
	public void save(student std) {
		
		System.out.println("Iam in studentcontorl---"+std);
		sdeo.save(std);
	}

}

package com.studentinfo;

import com.studentcontroler.studentcontorl;
import com.studentpojo.student;

public class infor {

	public static void main(String[] args) {

		student std = new student();
		System.out.println("-------------Started---------");
		std.setSid(1);
		std.setSname("madhavi");
		std.setSage(23);
		std.setSmarks(85.69);
		std.setSloc("HYD");
		
		
		studentcontorl st = new studentcontorl();
		st.save(std);

	}

}

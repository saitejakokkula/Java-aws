package com.control;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.connection.connection;

public class Test {
	
	
	public void getcmmsv() {
		Connection con = connection.getconnect();
		try {
			PreparedStatement ps = con.prepareStatement("select count(*) as ecount, max(sage) as maxsage, min(sage) as minsage, sum(sage) as sumsage, avg(sage) as avgsid from student1.student;");
			ResultSet r = ps.executeQuery();
			while(r.next()) {
				int count = r.getInt("ecount");
				int max = r.getInt("maxsage");
				int min = r.getInt("minsage");
				int sum = r.getInt("sumsage");
				double avg = r.getDouble("avgsid");
				
				System.out.println("count"+"----"+count+"---"+"max"+"----"+max+"----"+"min"+"----"+min+"----"+"sum"+"----"+sum+"----"+"avg"+"---"+avg);
			}
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}

	public static void main(String[] args) {
		
		Test t = new Test();
		t.getcmmsv();

	}

}

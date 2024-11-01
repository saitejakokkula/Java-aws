package stdpojo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

import com.connection.connection;

public class controlerstd {
	
	public List<stdpojo> data(String path){
		List<stdpojo> students = new ArrayList<>();
		FileReader f = null;
		BufferedReader b = null;
		
		try {
			f = new FileReader(path);
			b = new BufferedReader(f);
			for(String s = b.readLine(); s!=null; s= b.readLine()) {
				
				String[] data = s.split(",");
				stdpojo a = new stdpojo();
				if(data.length == 4) {
					a.setSid(Integer.valueOf(data[0]));
					a.setSname(data[1]);
					a.setSage(Integer.valueOf(data[2]));
					a.setScourse(data[3]);
					
					
					System.out.println(a.getSid());
					System.out.println(a.getSname());
					System.out.println(a.getSage());
					System.out.println(a.getScourse());
					System.out.println("--------------------");
					
					students.add(a);
					
					
				}
			}
	}catch(Exception e) {
	    System.out.println(e);
   }
		return students;
}
	
	public void savadata(List<stdpojo> data) {
		
		try {
			Connection con = connection.getconnect();
			PreparedStatement pstmt = con.prepareStatement("INSERT INTO slokam1.student (sid, sname, sage, scourse) VALUES (?, ?, ?, ?)");

	            for (stdpojo a : data) {
	                pstmt.setInt(1, a.getSid());
	                pstmt.setString(2, a.getSname());
	                pstmt.setInt(3, a.getSage());
	                pstmt.setString(4, a.getScourse());
	                pstmt.executeUpdate();
	            }
	            System.out.println("Data inserted successfully.");
		}catch(Exception e) {
			System.out.println(e);
		}
	}
		
		
	public static void main(String[] args) {
		
		
		controlerstd b = new controlerstd();
		List<stdpojo> s = b.data("C:\\Users\\kokku\\OneDrive\\Documents\\slokam.txt");
		
		if(s != null && !s.isEmpty()) {
            b.savadata(s);
        } else {
            System.out.println("No data to insert.");
        }

			
	}

}

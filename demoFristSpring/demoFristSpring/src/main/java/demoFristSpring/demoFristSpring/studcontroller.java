package demoFristSpring.demoFristSpring;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("studc")
public class studcontroller {
	
	@RequestMapping("name") //t is an annotation in Spring used to connect a URL (like /home) to a method in your code.
	public String name() {
		System.out.println("I am studcontroller class for name");
		return "Wellcome to SR Nagar..!";
	}
	@RequestMapping("data")
	public studentpojo data() {
		
		studentpojo std = new studentpojo();
	std.setSid(1);
    std.setSname("madhavi");
	std.setSage(25);
	std.setSmarks(75.36);
		return std;
		
	}
	@RequestMapping("names")
	public String[] names() {
		
		String[] s = {"sai", "madhu","akshu","raju"};
		return s;
	}
	@RequestMapping("value")
	public int[] values() {
		
		int[] s = {32,56,45,96,74,85};
		return s;
	}
	@RequestMapping("data1")
	public Double[] data1() {
		
		Double[] d = {56.35, 85.25, 75.45, 42.36, 65.98, 98.24};
		return d;
	}
	@RequestMapping("data2")
	public char[] data2() {
	    char[] chars = {'A', 'B', 'C', 'D', 'E', 'F'};
	    return chars;
	}
	@RequestMapping("data3")
	public Object data3() {
		
		Object o = "teja";
		return o;
	}
	@RequestMapping("data4")
	public Object data4() {
		
		studentpojo std = new studentpojo();
		std.setSid(1);
		std.setSname("madhavi");
		std.setSage(25);
		std.setSmarks(75.36);
		Object o = std;
		return o;
	}
	@RequestMapping("data5")
	public Object data5() {
		
		Object[] s = {"sai", 53, 86.36, 'A' };
		return s;
	}
	@RequestMapping("data6")
	public Object data6() {
		
		studentpojo std = new studentpojo();
		std.setSid(1);
		std.setSname("madhavi");
		std.setSage(25);
		std.setSmarks(75.36);
		Object[] s = {"teja", 63.23, std};
		return s;
	}
	@RequestMapping("getdata1")
	public studentpojo[] getdata(){
		
		studentpojo std = new studentpojo();
		std.setSid(1);
		std.setSname("madhavi");
		std.setSage(25);
		std.setSmarks(75.36);
		
		studentpojo std1 = new studentpojo();
		std1.setSid(2);
		std1.setSname("aditya");
		std1.setSage(26);
		std1.setSmarks(85.36);
		
		studentpojo std2 = new studentpojo();
		std2.setSid(3);
		std2.setSname("Raghu");
		std2.setSage(28);
		std2.setSmarks(98.36);
		
		studentpojo[] l = {std, std1, std2};
		return l;
	}
	
	@RequestMapping("getdata2")
	public List<studentpojo> getdatas(){
		
		studentpojo std = new studentpojo();
		std.setSid(1);
		std.setSname("madhavi");
		std.setSage(25);
		std.setSmarks(75.36);
		
		studentpojo std1 = new studentpojo();
		std1.setSid(2);
		std1.setSname("aditya");
		std1.setSage(26);
		std1.setSmarks(85.36);
		
		studentpojo std2 = new studentpojo();
		std2.setSid(3);
		std2.setSname("Raghu");
		std2.setSage(28);
		std2.setSmarks(98.36);
		List<studentpojo> c = new  ArrayList();
		c.add(std);
		c.add(std1);
		c.add(std2);
		return c;
	}
	@RequestMapping("getname")
	public List<String> getname(){
		
		List<String> s = new ArrayList<>();
		s.add("Suresh");
		return s;
	}
	@RequestMapping("getdata3")
	public Set<studentpojo> getdataes(){
		
		studentpojo std = new studentpojo();
		std.setSid(1);
		std.setSname("madhavi");
		std.setSage(25);
		std.setSmarks(75.36);
		
		studentpojo std1 = new studentpojo();
		std1.setSid(2);
		std1.setSname("aditya");
		std1.setSage(26);
		std1.setSmarks(85.36);
		
		studentpojo std2 = new studentpojo();
		std2.setSid(3);
		std2.setSname("Raghu");
		std2.setSage(28);
		std2.setSmarks(98.36);
		Set<studentpojo> c = new  HashSet<>();
		c.add(std);
		c.add(std1);
		c.add(std2);
		return c;
	}
	@RequestMapping("gnames")
	public Set<String> gnames(){
		
		Set<String> s = new HashSet<>();
		s.add("Siva");
		s.add("Teja");
		s.add("sai");
		return s;
	}
	@RequestMapping("getdata4")
	public Map<studentpojo, Integer> getdatameta(){
		
		studentpojo std = new studentpojo();
		std.setSid(1);
		std.setSname("madhavi");
		std.setSage(25);
		std.setSmarks(75.36);
		
		studentpojo std1 = new studentpojo();
		std1.setSid(2);
		std1.setSname("aditya");
		std1.setSage(26);
		std1.setSmarks(85.36);
		
		studentpojo std2 = new studentpojo();
		std2.setSid(3);
		std2.setSname("Raghu");
		std2.setSage(28);
		std2.setSmarks(98.36);
		Map<studentpojo, Integer> m = new HashMap<>();
		m.put(std, 50);
		m.put(std1, 51);
		m.put(std2, 52);
		return m;
	}
	@RequestMapping("gmeta")
	public Map<String, Integer> gmeta(){
		
		Map<String, Integer> m = new HashMap<>();
		m.put("sai", 101);
		m.put("swathi", 103);
		m.put("adhi", 102);
		return m;
	}
	@RequestMapping("std")
	public studentpojo stddata() {
		
		studentpojo s = new studentpojo();
		s.setSid(1);
		s.setSname("raghu");
		s.setSage(24);
		s.setSmarks(85.36);
		
		return s;
	}
	@RequestMapping("passport")
	public studentpojo stdpassport() {
		

		studentpojo s = new studentpojo();
		s.setSid(1);
		s.setSname("raghu");
		s.setSage(24);
		s.setSmarks(85.36);
		s.setPass(new passportpojo(101, 123859, 2045));
		
		return s;
		
	}
	@RequestMapping("Mobile")
	public studentpojo stdMobile() {
		
		studentpojo s = new studentpojo();
		s.setSid(1);
		s.setSname("raghu");
		s.setSage(24);
		s.setSmarks(85.36);
		
		List<Mobile> m = new ArrayList<>();
		m.add(new Mobile(10, "Jio", 89657423));
		m.add(new Mobile(11, "bsnl", 4563257));
		m.add(new Mobile(12, "airtel", 785964));
		
		s.setMob(m);
		
		return s;
	}
	@RequestMapping("course")
	public studentpojo stdcourse() {
		
		studentpojo s = new studentpojo();
		s.setSid(1);
		s.setSname("raghu");
		s.setSage(24);
		s.setSmarks(85.36);
		
		List<course> c = new ArrayList<>();
		c.add(new course(1, "Python", 15000));
		c.add(new course(2, "Java", 20000));
		c.add(new course(3, "aws", 15000));
		
		s.setCou(c);
		
		return s;
		
	}
	@RequestMapping("alldata")
	public studentpojo getalldata() {
		

		studentpojo s = new studentpojo();
		s.setSid(1);
		s.setSname("raghu");
		s.setSage(24);
		s.setSmarks(85.36);
		s.setPass(new passportpojo(101, 123859, 2045));
		
		
		List<Mobile> m = new ArrayList<>();
		m.add(new Mobile(10, "Jio", 89657423));
		m.add(new Mobile(11, "bsnl", 4563257));
		m.add(new Mobile(12, "airtel", 785964));
		
		List<course> c = new ArrayList<>();
		c.add(new course(1, "Python", 15000));
		c.add(new course(2, "Java", 20000));
		c.add(new course(3, "aws", 15000));
		
		
		s.setMob(m);
		s.setCou(c);
		
		return s;
		
	}
	

}

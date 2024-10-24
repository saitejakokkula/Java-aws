package com.cicso;

public class Test {

	public static void main(String[] args) {
		
//		emp e = new emp();
//		e.setEid(1);
//		e.setEname("sai");
//		e.setEsal(85.36);
//		e.setEloc("Hyderabad");
//		
//		System.out.println(e);
//		System.out.println(e.hashCode());
//		System.out.println("---------------------------------------");
//		
//		e.setEloc("mubai");
//		System.out.println(e);// with same object address the values will be change
//		System.out.println(e.hashCode());
//		System.out.println("------------------------------------------");
//		//String s = new String("akshitha");
//		String s = "akshitha";
//		String h = s.concat("chelli");
//		System.out.println(s);
//		System.out.println(s.hashCode());
//		System.out.println(h);
//		System.out.println(h.hashCode());
//		
//		
//		System.out.println("--------------------------------------------------------------");
//		
//		String h1 = new String("sai");
//		String h2 = new String("teja");
//		String h3 = new String("ram");
//		String h4 = new String("sai");
//		String h5 = new String("madhavi");
//		
//		System.out.println(h1.equals(h2));//contain comparetion
//		System.out.println(h2.equals(h3));
//		System.out.println(h3.equals(h4));
//		System.out.println(h4.equals(h5));
//		System.out.println(h1.equals(h4));
//		
//		System.out.println(h1==h2);//refer comparetion
//		
//		System.out.println("---------------------------------------------------------");
//		
//		String s1 = "ram";
//		String s2 = "sai";
//		String s3 = "sam";
//		String s4 = "sai";
//		
//		System.out.println(s2.equals(s4));
//		System.out.println(s1.hashCode());// it as different hash code address
//		System.out.println(s3.hashCode());// it as different hash code address
//		System.out.println(s2 == s4);
//		System.out.println(s2.hashCode());// In literals doesn't allow dualities values, it store same value address
//		System.out.println(s4.hashCode());
		
		dept d = new dept(101, "HR");
		emp e = new emp(1, "sai", 856.3, "Hyderabad", d);
		System.out.println("Original emp object: "+e);
		System.out.println(e.hashCode());
		System.out.println("---------------------------------");
		emp e1 = e.clone();
		System.out.println("Cloned emp object: " +e1);
		System.out.println(e1.hashCode());
		
		 emp f = e1.setEid(90);
		 System.out.println(f.hashCode()+"-----");
		 System.out.println(f);
		 emp f1 = e1.setEname("ram");
		 System.out.println(f1.hashCode()+"---");
		 System.out.println(f1);
		
		e1.getDep().setDname("Finance");
		System.out.println("After modifying the cloned emp's dept:");
		System.out.println("Original emp object: " + e);  
		System.out.println("Cloned emp object: " + e1);
		
		
	}

}
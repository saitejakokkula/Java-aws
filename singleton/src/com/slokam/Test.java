package com.slokam;

public class Test {

	public static void main(String[] args) {
		
	
		        // Fetching the Singleton instance once
		        singleton s1 = singleton.getSingle();
		        s1.message();
		        
		        // Print hash code after first retrieval
		        System.out.println("Singleton instance hashCode (s1): " + s1.hashCode());
		        
		        // Fetch the Singleton instance again and verify the hash code
		        singleton s2 = singleton.getSingle();
		        System.out.println("Singleton instance hashCode (s2): " + s2.hashCode());
		        
		        // Verify that s1 and s2 are indeed the same instance by printing hash codes
		        s2.connectToDatabase();
		        s2.getcoursedata("akshita");
		        s2.getpersondetail("aws");
		        
		        singleton s3 = singleton.getSingle();
		        System.out.println("Singleton instance hashcode (s3): " + s3.hashCode());

		        // Print hash codes after the operations for verification
		        System.out.println("Final check: s1 hashCode: " + s1.hashCode());
		        System.out.println("Final check: s2 hashCode: " + s2.hashCode());
		        System.out.println("Final check: s3 hashcode: " + s3.hashCode());
		    }

		
	}


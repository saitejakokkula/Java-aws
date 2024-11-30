package Practice29_11_2024javaObjectJson.Practice29_11_2024javaObjectJson;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Arrdata")
public class ArrayDatatype {
	
	
	
	@RequestMapping("names")
	public String[] name()
	{
		String[] data = {"Birava","Raja","sita","Lakshman"};
		
		System.out.println(data);
		return data;
	}
	
	/*URL :- http://localhost:8080/Arrdata/names
	 * Output :- 
	 * 
	 * ["Birava","Raja","sita","Lakshman"]
	 */
	
	
	
	
	@RequestMapping("ides")
	public int[] ids()
	{
		int[]  data = {10,20,30,40,50};
		System.out.println(data);
		
		return data;
	}
	/*
	 * URL :- http://localhost:8080/Arrdata/ides
	 * 
	 * 		[10,20,30,40,50]
	 * 
	 */
	
	
	
	
	@RequestMapping("salary")
	public double[]  salary()
	{
		double[] data = {10.00,20.00,30.00,40.00,50.00};
		System.out.println(data);
		
		return data;
	}
	
	/*
	 * URL : http://localhost:8080/Arrdata/salary
	 * 
	 * 		[10.0,20.0,30.0,40.0,50.0]
	 */
	
	
	@RequestMapping("charr")
	public char[]   charr()
	{
		char[] data= {'a','d','f','r'};
		
		System.out.println(data);
		
		return data;
	}
	
	/*	URL :- http://localhost:8080/Arrdata/charr
	 * 
	 * [10.0,20.0,30.0,40.0,50.0]
	 * 
	 */

}

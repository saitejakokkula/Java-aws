package com.sqlnamedperameter;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Testing
{

	public static void main(String[] args)
	{
		ApplicationContext on = new AnnotationConfigApplicationContext(GetConfiguration.class);
		
				Controller cc		=	on.getBean(Controller.class);
				
				Scanner sc = new Scanner(System.in);
				
				boolean exit = false;
				
				while(!exit)
				{
					System.out.println("\n Menu ");
					
					System.out.println("1. Save The Person");
					System.out.println("2.Update The Person");
					System.out.println("3.Delete The Person");
					System.out.println("4.Get One Complete Row by person id");
					System.out.println("5.Get One Column by perso id");
					System.out.println("6.Get ALL Rows");
					System.out.println("7.Get All Rows By Using RoWMap Interface");
					System.out.println("8.Get One Column with  MultiRows");
					System.out.println("9.Get Multiple Columns and Multiple Rows");
					System.out.println("10 Get Multiple Columan in One Row");
					System.out.println("11.Exit");
					int choice = sc.nextInt();
						sc.nextLine();
						
						switch(choice)
						{
						
						case 1:
								
									System.out.println("Please Enter The Person Id :-");
									int pid = sc.nextInt();
									
									System.out.println("Please Enter The Person Name :-");
									String pname = sc.next();
									
									System.out.println("Please Enter The Person Age :-");
									int page = sc.nextInt();
									
									System.out.println("please Enter the Person Mobile Number :-");
									long pmob = sc.nextLong();
									
									System.out.println("Please Enter the Person Location :-");
									String ploc = sc.next();
									
									PersonPojo poj = new PersonPojo(pid, pname, page, pmob, ploc);
									cc.save(poj);
									
									System.out.println("---Data Saved Succefully---");
						break;
						
						case 2: 
									System.out.println("Please Enter Person id :-");
									int pid1 = sc.nextInt();
									
									System.out.println("Please Enter Person Age :-");
									int page1 = sc.nextInt();
									
									System.out.println("Please Enter Person Location");
									String ploc1 = sc.next();
									
									cc.update(pid1, page1, ploc1);
									
									System.out.println("--Data is updated Succefully--");
							break;
							
						case 3:
							
								System.out.println("Please Enter The Person id :-");
								int pid2 = sc.nextInt();
								
								cc.delete(pid2);
								
								System.out.println("---Data is deleted Succefully---");
							break;
							
						case 4: 
								
								System.out.println("please Enter person id :-");
								int pid3 = sc.nextInt();
								
								PersonPojo details =cc.oneCompleteRow(pid3);
								
								System.out.println("details :- "+details);
							break;
							
						case 5: 
								
								System.out.println("please Enter Person pid :-");
								int pid4 = sc.nextInt();
								
									String	name	=	cc.pname(pid4);
									
									System.out.println("Name is :-"+name);
						break;
						
						case 6 :
									List<PersonPojo>dd	=cc.GetAll();
											
									Iterator<PersonPojo>	display	=	dd.iterator();
									
									while(display.hasNext())
									{
										System.out.println(display.next());
									}
									
							break;
						
						case 7:
									        List<PersonPojo>  dda  = cc.GetAllRowMapInterface();
									        
									      	Iterator<PersonPojo> dada =	dda.iterator();
									      	
									      	while(dada.hasNext())
									      	{
									      		System.out.println(dada.next());
									      	}
									      	
							break;
							
						case 8 : 
										List<Map<String, Object>> ename = cc.multirows();
										
										Iterator<Map<String, Object>> enamess	 = ename.iterator();
										
										while(enamess.hasNext())
										{
											System.out.println(enamess.next());
										}
						break;	
						
						
						case 9: 
										List<Map<String, Object>>	test =	cc.MultiColumns();
										
										Iterator<Map<String, Object>> tester =	test.iterator();
										
											while(tester.hasNext())
											{
												System.out.println(tester.next());
											}
							break;
							
						case 10:
							
										System.out.println("Please Enter the Person id :-");
										
											int pid5  =sc.nextInt();
										
										List<Map<String, Object>> dadaa	=cc.MulticolOneRow(pid5);
										
											Iterator<Map<String, Object>> dodo=	dadaa.iterator();
											
											while(dodo.hasNext())
											{
												System.out.println(dodo.next());
											}
							break;
							
						case 11:
							
									exit = true;
									System.out.println("Exiting ..... ");
							break;			
						
						default :
							System.out.println("Invalid Operation--!");
						}
				}
				
				sc.close();
				
			
}

}
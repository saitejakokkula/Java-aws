package com.customer;

import java.util.Scanner;

import com.Controller.productController;
import com.pojo.product;

public class test {

	public static void main(String[] args) {
		
		productController pc = new productController(); // Create an instance of the controller
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose an option:");
        System.out.println("1. Insert product");
        System.out.println("2. Update product");
        System.out.println("3. Get product by ID");
        System.out.println("4. Get all products");
        System.out.println("5. Delete product");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                product p = new product();
                System.out.println("Enter a pid:");
                int pid = sc.nextInt();
                System.out.println("Enter a pname:");
                String pname = sc.next();
                System.out.println("Enter a pprice:");
                double pprice = sc.nextDouble();
                System.out.println("Enter a pgst:");
                double pgst = sc.nextDouble();
                System.out.println("Enter a pvendor:");
                String pvendor = sc.next();
                System.out.println("Enter a pcountry:");
                String pcountry = sc.next();
                System.out.println("Enter a ptype:");
                String ptype = sc.next();
                
               
                p.setPid(pid);
                p.setpname(pname);
                p.setPprice(pprice);
                p.setPgst(pgst);
                p.setPvendor(pvendor);
                p.setPcountry(pcountry);
                p.setPtype(ptype);
                
                pc.save(p);
                break;

            case 2:
                
                System.out.println("Enter the pid of the product you want to update:");
                int updatePid = sc.nextInt();
                System.out.println("Enter the new price:");
                double newPrice = sc.nextDouble();
                System.out.println("Enter the new GST:");
                double newGst = sc.nextDouble();
                
                
                pc.update(updatePid, newPrice, newGst);
                break;

            case 3:
                
                System.out.println("Enter the pid of the product you want to view:");
                int viewPid = sc.nextInt();
               
                pc.getbyid(viewPid);
                break;

            case 4:
                System.out.println("Fetching all product data:");
                
                pc.getalldata();
                break;

            case 5:
                System.out.println("Enter the pid of the product you want to delete:");
                int deletePid = sc.nextInt();
                
                pc.delete(deletePid);
                break;

            default:
                System.out.println("Invalid option");
                break;
        }

	}

}

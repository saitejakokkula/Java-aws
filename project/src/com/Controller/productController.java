package com.Controller;

import com.Deo.productDeo;
import com.pojo.product;

public class productController {
	
	private productDeo d = new productDeo();
	
	public void save(product pod) {
		System.out.println("I am in controller class"+pod);	
		d.save(pod);
	}
	
	
	public void update(int pid, double pprice, double pgst) {
		d.update(pid, pprice, pgst);
	}
	public void delete(int pid) {
		d.delete(pid);
		
	}
	public void getbyid(int pid) {
		d.getbyid(pid);
		
	}
	public void getalldata() {
		d.getalldata();
	}

}

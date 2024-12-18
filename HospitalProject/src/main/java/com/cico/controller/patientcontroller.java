package com.cico.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cico.Dto.patientDTO;
import com.cico.entity.patient;
import com.cico.services.patientservices;

import jakarta.validation.Valid;

@RestController
@RequestMapping("percontrol")
public class patientcontroller {

	@Autowired
	private patientservices ser;
	
	private static final Logger log = LoggerFactory.getLogger(patientcontroller.class);
	
	
	@PostMapping("save")
	public ResponseEntity<patient> save(@Valid @RequestBody patient pt) throws Exception
	{
		
		log.trace(" trace method in logs I am in controller class --"+pt.toString());
		
		log.debug(" debub method in logs I am in controller class --"+pt.toString());
		
		log.info(" info method in logs I am in controller class --"+pt.toString());
		
		log.warn(" warn method in logs I am in controller class --"+pt.toString());
		
		log.error(" error method in logs I am in controller class --"+pt.toString());
		
		
			
		ser.save(pt);
		return new ResponseEntity<patient>(pt, HttpStatus.CREATED);
		
}
	@GetMapping("getall")
	public ResponseEntity<List<patient>> getall() throws Exception {
		
		
	    log.debug("I am in personcontroller class started");
		
		log.info("I am in personcontroller class  started");
		
		log.warn("I am in personcontroller class started");
		
		log.error("I am in personcontroller class started");
		
		
	
	   return ser.getall();
}
	
	 @GetMapping("getbyid/{pid}")
     public ResponseEntity<patient> getbyid(@PathVariable int pid) throws Exception {
	
	   log.debug("I am in personcontroller class started"+pid);
		
		log.info("I am in personcontroller class  started"+pid);
		
		log.warn("I am in personcontroller class started"+pid);
		
		log.error("I am in personcontroller class started"+pid);
	
	    
	
	    log.debug("I am in class completed"+pid);
		
		log.info("I am in personcontroller class completed"+pid);
		
		log.warn("I am in personcontroller class completed"+pid);
		
		log.error("I am in personcontroller class completed"+pid);
	
	   return ser.getbyid(pid);
 }
     
     @DeleteMapping("delete/{pid}")
     public ResponseEntity<String> delete(@PathVariable int pid) throws Exception{
	
	   log.debug("I am in personcontroller class started"+pid);
		
		log.info("I am in personcontroller class  started"+pid);
		
		log.warn("I am in personcontroller class started"+pid);
		
		log.error("I am in personcontroller class started"+pid);
	
	     
	     
	     log.debug("I am in personcontroller class completed"+pid);
		
		log.info("I am in personcontroller class completed"+pid);
		
		log.warn("I am in personcontroller class completed"+pid);
		
		log.error("I am in personcontroller class completed"+pid);
		
	 return ser.delete(pid);
}
     @GetMapping("getbyname/{pname}")
    public ResponseEntity<List<patient>> getbyname(@PathVariable String pname) throws Exception {
	
	    log.debug("I am in personcontroller class started"+pname);
		
		log.info("I am in personcontroller class  started"+pname);
		
		log.warn("I am in personcontroller class started"+pname);
		
		log.error("I am in personcontroller class started"+pname);
	
	     
	
	    log.debug("I am in personcontroller class completed"+pname);
		
		log.info("I am in personcontroller class completed"+pname);
		
		log.warn("I am in personcontroller class completed"+pname);
		
		log.error("I am in personcontroller class completed"+pname);
		
	return ser.getbyname(pname);
  }
	
}
